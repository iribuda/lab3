package lab5.mvc.DAO;

import lab5.mvc.Entity.Order;
import lab5.mvc.Entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDAO implements DAO<Order>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Order> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<Order> query = session.createQuery("from Order", Order.class);
        List<Order> allOrders = query.getResultList();

        return allOrders;
    }

    @Override
    public void save(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(order);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Order> query = session.createQuery("delete from Order " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Order get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Order order = session.get(Order.class, id);
        return order;
    }
}
