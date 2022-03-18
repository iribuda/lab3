package lab5.mvc.DAO;

import lab5.mvc.Entity.TourPackage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourPackageDAO implements DAO<TourPackage> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TourPackage> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<TourPackage> query = session.createQuery("from TourPackage", TourPackage.class);
        List<TourPackage> allTourPackages = query.getResultList();

        return allTourPackages;
    }

    @Override
    public void save(TourPackage tourPackage) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(tourPackage);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<TourPackage> query = session.createQuery("delete from TourPackage " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public TourPackage get(int id) {
        Session session = sessionFactory.getCurrentSession();
        TourPackage tourPackage = session.get(TourPackage.class, id);
        return tourPackage;
    }
}
