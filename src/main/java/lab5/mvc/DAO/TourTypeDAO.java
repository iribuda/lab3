package lab5.mvc.DAO;

import lab5.mvc.Entity.TourType;
import lab5.mvc.Entity.TourType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourTypeDAO implements DAO<TourType> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TourType> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<TourType> query = session.createQuery("from TourType", TourType.class);
        List<TourType> allTourTypes = query.getResultList();

        return allTourTypes;
    }

    @Override
    public void save(TourType tourType) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(tourType);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<TourType> query = session.createQuery("delete from TourType " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public TourType get(int id) {
        Session session = sessionFactory.getCurrentSession();
        TourType tourType = session.get(TourType.class, id);
        return tourType;
    }
}
