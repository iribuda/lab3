package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.DAO.EmployeeDAO;
import lab5.mvc.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private DAO<Employee> employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Employee get(int id) {
        return employeeDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
