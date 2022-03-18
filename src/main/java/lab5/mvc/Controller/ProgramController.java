package lab5.mvc.Controller;

import lab5.mvc.Entity.Program;
import lab5.mvc.Service.ProgramService;
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
@RequestMapping("/programs")
public class ProgramController {
    @Autowired
    private ProgramService programService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Program> programs = programService.getAll();
        model.addAttribute("programs", programs);
        return "ProgramsAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Program program = new Program();
        model.addAttribute("program", program);
        return "programAdd";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("program") @Valid final Program program,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "programAdd";
        }
        programService.save(program);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        Program program = programService.get(id);
        model.addAttribute("program", program);
        return "programAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        programService.delete(id);
        return "redirect:/programs/";
    }
}
