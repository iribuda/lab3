package air.DAO;

import air.entity.Employee;
import air.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDAO implements DAO<Employee>{

    @Override
    public Employee get(int id) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            session.getTransaction().commit();
            return employee;
        } finally {
            session.close();
        }
    }

    @Override
    public void getAll() {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee")
                    .getResultList();
            for(Employee e: employees) System.out.println(e.toString());
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void save(Employee employee) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println("Employee was saved!");
        } finally {
            session.close();
        }
    }

    @Override
    public void edit(int id, Employee employee) {
        Session session = DAO.buildSessionFactory().getCurrentSession();
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
        Session session = DAO.buildSessionFactory().getCurrentSession();
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
