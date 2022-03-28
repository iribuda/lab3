package lab7.DAO;

import lab7.Entity.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventDAO implements DAO<Event>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Event get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Event event = session.get(Event.class, id);
        return event;
    }

    @Override
    public List<Event> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Event> query = session.createQuery("from Event", Event.class);
        List<Event> events = query.getResultList();
        return events;
    }
    
    @Override
    public void save(Event event) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(event);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Event> query = session.createQuery("delete from Event " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
