package lab5.mvc.DAO;

import lab5.mvc.Entity.TourTask;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourTaskDAO implements DAO<TourTask> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TourTask> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<TourTask> query = session.createQuery("from TourTask", TourTask.class);
        List<TourTask> allTourTasks = query.getResultList();

        return allTourTasks;
    }

    @Override
    public void save(TourTask tourTask) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(tourTask);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<TourTask> query = session.createQuery("delete from TourTask " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public TourTask get(int id) {
        Session session = sessionFactory.getCurrentSession();
        TourTask tourTask = session.get(TourTask.class, id);
        return tourTask;
    }
}
