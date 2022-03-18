package lab5.mvc.Controller;

import lab5.mvc.Entity.Event;
import lab5.mvc.Service.EventService;
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
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Event> events = eventService.getAll();
        model.addAttribute("events", events);
        return "EventsAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Event event = new Event();
        model.addAttribute("event", event);
        return "eventAdd";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("event") @Valid final Event event,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "eventAdd";
        }
        eventService.save(event);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        Event event = eventService.get(id);
        model.addAttribute("event", event);
        return "eventAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        eventService.delete(id);
        return "redirect:/events/";
    }
}
