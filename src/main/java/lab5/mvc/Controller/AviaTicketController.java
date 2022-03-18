package lab5.mvc.Controller;

import lab5.mvc.Entity.AviaTicket;
import lab5.mvc.Entity.Employee;
import lab5.mvc.Service.AviaTicketService;
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
@RequestMapping("/aviatickets")
public class AviaTicketController {
    @Autowired
    private AviaTicketService aviaTicketService;

    @GetMapping("/")
    public String showAll(Model model){
        List<AviaTicket> aviaTickets = aviaTicketService.getAll();
        model.addAttribute("aviaTickets", aviaTickets);
        return "AviaTicketsAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        AviaTicket aviaTicket = new AviaTicket();
        model.addAttribute("aviaTicket", aviaTicket);
        return "aviaTicketAdd";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("aviaTicket") @Valid final AviaTicket aviaTicket,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "aviaTicketAdd";
        }
        aviaTicketService.save(aviaTicket);
        return "redirect:/aviatickets/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        AviaTicket aviaTicket = aviaTicketService.get(id);
        model.addAttribute("aviaTicket", aviaTicket);
        return "aviaTicketAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        aviaTicketService.delete(id);
        return "redirect:/aviatickets/";
    }
}
