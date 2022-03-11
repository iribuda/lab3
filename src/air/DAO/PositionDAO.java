package air.DAO;

import air.entity.Employee;
import air.entity.Position;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PositionDAO implements DAO<Position>{

    @Override
    public Position get(int id){
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            Position position = session.get(Position.class, id);
            session.getTransaction().commit();
            return position;
        } finally {
            session.close();
        }
    }

    @Override
    public void getAll(){
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            List<Position> positions = session.createQuery("from Position")
                    .getResultList();
            for(Position p: positions) System.out.println(p.toString());
            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void save(Position position){
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            session.save(position);
            session.getTransaction().commit();
            System.out.println("Position was saved!");
        } finally {
            session.close();
        }
    }

    @Override
    public void edit(int id, Position position){
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            String sql = String.format("update Position set position='%s' where id='%s'", position.getPosition(), id);
            session.createQuery(sql).executeUpdate();
            session.getTransaction().commit();
            System.out.println("Position was edited!");
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(int id){
        Session session = DAO.buildSessionFactory().getCurrentSession();
        try {
            session.beginTransaction();
            Position position = session.get(Position.class, id);
            session.delete(position);
            session.getTransaction().commit();
            System.out.println("Position was edited!");
        } finally {
            session.close();
        }
    }
}