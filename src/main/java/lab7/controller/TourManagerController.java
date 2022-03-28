package lab7.controller;

import lab7.Entity.Tour;
import lab7.Service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tourManager")
public class TourManagerController {
    @Autowired
    TourService tourService;

    @GetMapping("/tours")
    public String showAllTours(Model model){
        List<Tour> tours = tourService.getAll();
        model.addAttribute("tours", tours);
        return "ToursAll";
    }

    @DeleteMapping("/tours/{id}")
    public String deleteTour(@PathVariable("id") int id){
        tourService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/tours/add")
    public String addTour(Model model){
        Tour tour = new Tour();
        model.addAttribute("tour", tour);
        return "tourAdd";
    }

    @RequestMapping("/tours/save")
    public String saveTour(@RequestBody Tour tour){
        tourService.save(tour);
        return "redirect:/tours/";
    }

    @RequestMapping ("/tours/update")
    public String update(@RequestParam("id") int id,
                         Model model){
        Tour tour = tourService.get(id);
        model.addAttribute("tour", tour);
        return "tourAdd";
    }
}
