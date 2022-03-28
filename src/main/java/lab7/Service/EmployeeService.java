package lab7.Service;

import lab7.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee get(int id);

    public void delete(int id);
}
