package lab7.DAO;

import lab7.Entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PositionDAO implements DAO<Position>{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public Position get(int id){
        Session session = sessionFactory.getCurrentSession();
        Position position = session.get(Position.class, id);
        return position;
    }

    @Override
    @Transactional
    public List<Position> getAll(){
        Session session = sessionFactory.getCurrentSession();
        List<Position> positions = session.createQuery("from Position")
                    .getResultList();
        return positions;
    }

    @Override
    @Transactional
    public void save(Position position){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(position);
    }

    @Override
    @Transactional
    public void delete(int id){
        Session session = sessionFactory.getCurrentSession();
        Position position = session.get(Position.class, id);
        session.delete(position);
    }
}