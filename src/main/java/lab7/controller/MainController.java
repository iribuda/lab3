package lab7.controller;

import lab7.Entity.Employee;
import lab7.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("")
    public String showForAll(){
        return "main";
    }

}
