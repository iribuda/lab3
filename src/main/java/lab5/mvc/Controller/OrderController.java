package lab5.mvc.Controller;

import lab5.mvc.Entity.Order;
import lab5.mvc.Service.OrderService;
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
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String showAll(Model model){
        List<Order> orders = orderService.getAll();
        model.addAttribute("orders", orders);
        return "OrdersAll";
    }

    @GetMapping("/add")
    public String add(Model model){
        Order order = new Order();
        model.addAttribute("order", order);
        return "orderAdd";
    }

    @GetMapping("/save")
    public String save(@ModelAttribute("order") @Valid final Order order,
                       final BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return "orderAdd";
        }
        orderService.save(order);
        return "redirect:/";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id,
                                 Model model){
        Order order = orderService.get(id);
        model.addAttribute("order", order);
        return "orderAdd";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        orderService.delete(id);
        return "redirect:/orders/";
    }
}
