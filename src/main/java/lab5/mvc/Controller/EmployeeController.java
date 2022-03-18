package lab5.mvc.Controller;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Employee;
import lab5.mvc.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeService.getAll();
        model.addAttribute("emps", allEmployees);
        return "EmployeesAll";
    }

    @GetMapping("/add")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @RequestMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/employees/";
    }

    @GetMapping("/update")
    public String updateEmployee(@RequestParam("empId") int id,
                                 Model model){
        Employee employee = employeeService.get(id);
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.delete(id);
        return "redirect:/employees/";
    }
}
