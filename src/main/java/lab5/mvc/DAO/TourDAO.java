package lab5.mvc.DAO;

import lab5.mvc.Entity.Tour;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourDAO implements DAO<Tour>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Tour> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<Tour> query = session.createQuery("from Tour", Tour.class);
        List<Tour> allTours = query.getResultList();

        return allTours;
    }

    @Override
    public void save(Tour tour) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(tour);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Tour> query = session.createQuery("delete from Tour " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Tour get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Tour tour = session.get(Tour.class, id);
        return tour;
    }
}
