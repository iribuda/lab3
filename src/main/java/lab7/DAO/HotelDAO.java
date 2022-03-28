package lab7.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lab7.Entity.Hotel;

import java.util.List;

@Repository
public class HotelDAO implements DAO<Hotel>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Hotel get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Hotel hotel = session.get(Hotel.class, id);
        return hotel;
    }

    @Override
    public List<Hotel> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Hotel> query = session.createQuery("from Hotel", Hotel.class);
        List<Hotel> hotels = query.getResultList();
        return hotels;
    }
    
    @Override
    public void save(Hotel hotel) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(hotel);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Hotel> query = session.createQuery("delete from Hotel " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }
}
