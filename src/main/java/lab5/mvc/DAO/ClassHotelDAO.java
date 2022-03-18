package lab5.mvc.DAO;

import lab5.mvc.Entity.ClassHotel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassHotelDAO implements DAO<ClassHotel>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public ClassHotel get(int id) {
        Session session = sessionFactory.getCurrentSession();
        ClassHotel classHotel = session.get(ClassHotel.class, id);
        return classHotel;
    }

    @Override
    public List<ClassHotel> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<ClassHotel> query = session.createQuery("from ClassHotel", ClassHotel.class);
        List<ClassHotel> classHotels = query.getResultList();
        return classHotels;
    }
    
    @Override
    public void save(ClassHotel classHotel) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(classHotel);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<ClassHotel> query = session.createQuery("delete from ClassHotel " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
