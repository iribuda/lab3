package lab7.controller;

import lab7.Entity.Employee;
import lab7.Entity.Position;
import lab7.Entity.Tour;
import lab7.Entity.TourTask;
import lab7.Service.EmployeeService;
import lab7.Service.PositionService;
import lab7.Service.TourService;
import lab7.Service.TourTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/zam")
public class ZamController {
    @Autowired
    private TourTaskService tourTaskService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private TourService tourService;

    @GetMapping("/tourtasks/add")
    public String addTourTask(Model model){
        TourTask tourTask = new TourTask();
//        List<Tour> tours = tourService.getAll();
//        List<Employee> employees = employeeService.getAll();
//        model.addAttribute("tours", tours);
//        model.addAttribute("employees", employees);
        model.addAttribute("tourTask", tourTask);
        return "tourTaskAdd";
    }

    @PostMapping("/tourtasks")
    public String saveTourTask(@RequestBody TourTask tourTask){
        tourTaskService.save(tourTask);
        return "redirect:/";
    }

    @GetMapping("/positions/add")
    public String add(Model model){
        Position position = new Position();
        model.addAttribute("position", position);
        return "positionAdd";
    }

    @RequestMapping("/positions")
    public String save(@RequestBody Position position){
        positionService.save(position);
        return "redirect:/";
    }

    @GetMapping("/employees/add")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @RequestMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return "redirect:/";
    }

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

    @GetMapping("/add")
    public String addTour(Model model){
        Tour tour = new Tour();
        model.addAttribute("tour", tour);
        return "tourAdd";
    }

    @RequestMapping("/save")
    public String saveTour(@RequestBody Tour tour){
        tourService.save(tour);
        return "redirect:/tours/";
    }

    @RequestMapping ("/update")
    public String update(@RequestParam("id") int id,
                         Model model){
        Tour tour = tourService.get(id);
        model.addAttribute("tour", tour);
        return "tourAdd";
    }
}
