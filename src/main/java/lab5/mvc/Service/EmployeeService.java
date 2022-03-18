package lab5.mvc.Service;

import lab5.mvc.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee get(int id);

    public void delete(int id);
}
