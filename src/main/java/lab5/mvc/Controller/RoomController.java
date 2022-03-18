package lab5.mvc.Controller;

import lab5.mvc.Entity.Room;
import lab5.mvc.Service.RoomService;
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
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Room> rooms = roomService.getAll();
        model.addAttribute("rooms", rooms);
        return "RoomsAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Room room = new Room();
        model.addAttribute("room", room);
        return "roomAdd";
    }

    @RequestMapping("/save")
    public String save(@ModelAttribute("room") @Valid final Room room,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "roomAdd";
        }
        roomService.save(room);
        return "redirect:/rooms/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        Room room = roomService.get(id);
        model.addAttribute("room", room);
        return "roomAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        roomService.delete(id);
        return "redirect:/rooms/";
    }
}
