package lab5.mvc.DAO;


import lab5.mvc.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAO implements DAO<Employee>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Employee get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        return employee;
    }

    @Override
    @Transactional
    public List<Employee> getAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee")
                    .getResultList();
        return employees;
    }

    @Override
    @Transactional
    public void save(Employee employee) {

        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }

    @Override
    public void edit(int id, Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            String sql = String.format("update Employee set passport_number=%d, name='%s', address='%s' where id=%d",
                    employee.getPassport_number(), employee.getName(), employee.getAddress(), id);
            session.createQuery(sql).executeUpdate();
            session.getTransaction().commit();
            System.out.println("Employee was edited!");
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Employee was edited!");
        } finally {
            session.close();
        }
    }
}
