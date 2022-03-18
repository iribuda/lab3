package lab5.mvc.DAO;

import lab5.mvc.Entity.Tourist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TouristDAO implements DAO<Tourist>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Tourist> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<Tourist> query = session.createQuery("from Tourist", Tourist.class);
        List<Tourist> allTourists = query.getResultList();

        return allTourists;
    }

    @Override
    public void save(Tourist tourist) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(tourist);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Tourist> query = session.createQuery("delete from Tourist " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Tourist get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Tourist tourist = session.get(Tourist.class, id);
        return tourist;
    }
}
