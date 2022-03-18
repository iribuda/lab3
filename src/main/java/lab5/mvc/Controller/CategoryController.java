package lab5.mvc.Controller;

import lab5.mvc.Entity.Category;
import lab5.mvc.Entity.Employee;
import lab5.mvc.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "CategoriesAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Category category = new Category();
        model.addAttribute("category", category);
        return "categoryAdd";
    }

    @GetMapping("/save")
    public String save(@ModelAttribute("category") @Valid final Category category,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "categoryAdd";
        }
        categoryService.save(category);
        return "redirect:/categories/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                         Model model){
        Category category = categoryService.get(id);
        model.addAttribute("category", category);
        return "categoryAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        categoryService.delete(id);
        return "redirect:/categories/";
    }
}
