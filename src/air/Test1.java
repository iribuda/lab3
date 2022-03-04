package air;

import air.entity.Employee;
import air.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Position.class)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = null;

        try{
            session = factory.getCurrentSession();
            Position position = new Position("IT");
            Employee employee = new Employee(445588, "Min Yulia", "Brown street");
            employee.setPosition(position);

            session.beginTransaction();

            session.save(position);
            session.save(employee);

            session.getTransaction().commit();
            System.out.println("DONE!");
        }finally {
            session.close();
            factory.close();
        }
    }
}
