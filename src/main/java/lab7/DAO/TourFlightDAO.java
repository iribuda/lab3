package lab7.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lab7.Entity.TourFlight;

import java.util.List;

@Repository
public class TourFlightDAO implements DAO<TourFlight> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TourFlight> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<TourFlight> query = session.createQuery("from TourFlight", TourFlight.class);
        List<TourFlight> allTourFlights = query.getResultList();

        return allTourFlights;
    }

    @Override
    public void save(TourFlight tourFlight) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(tourFlight);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<TourFlight> query = session.createQuery("delete from TourFlight " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public TourFlight get(int id) {
        Session session = sessionFactory.getCurrentSession();
        TourFlight tourFlight = session.get(TourFlight.class, id);
        return tourFlight;
    }
}
