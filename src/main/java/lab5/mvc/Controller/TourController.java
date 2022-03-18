package lab5.mvc.Controller;

import lab5.mvc.Entity.Tour;
import lab5.mvc.Service.TourService;
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
@RequestMapping("/tours")
public class TourController {
    @Autowired
    private TourService tourService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Tour> tours = tourService.getAll();
        model.addAttribute("tours", tours);
        return "ToursAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Tour tour = new Tour();
        model.addAttribute("tour", tour);
        return "tourAdd";
    }

    @GetMapping("/save")
    public String save(@ModelAttribute("tour") @Valid final Tour tour,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "tourAdd";
        }
        tourService.save(tour);
        return "redirect:/tours/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        Tour tour = tourService.get(id);
        model.addAttribute("tour", tour);
        return "tourAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        tourService.delete(id);
        return "redirect:/tours/";
    }
}
