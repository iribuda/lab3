package lab5.mvc.Controller;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    DAO<Employee> employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeDAO.getAll();
        model.addAttribute("emps", allEmployees);
        return "EmployeesAll";
    }
}
