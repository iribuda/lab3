package air.DAO;

import air.entity.Employee;
import air.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface DAO<T> {

    public  T get(int id);
    public  void getAll();
    public  void save(T object);
    public  void edit(int id, T object);
    public  void delete(int id);

    static SessionFactory buildSessionFactory(){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Position.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        return factory;
    }
}
