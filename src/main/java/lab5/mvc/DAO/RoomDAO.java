package lab5.mvc.DAO;

import lab5.mvc.Entity.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoomDAO implements DAO<Room>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Room> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<Room> query = session.createQuery("from Room", Room.class);
        List<Room> allRooms = query.getResultList();

        return allRooms;
    }

    @Override
    public void save(Room room) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(room);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Room> query = session.createQuery("delete from Room " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Room get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Room room = session.get(Room.class, id);
        return room;
    }
}
