package lab7.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lab7.Entity.Program;

import java.util.List;

@Repository
public class ProgramDAO implements DAO<Program> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Program> getAll() {
        Session session = sessionFactory.getCurrentSession();

        Query<Program> query = session.createQuery("from Program", Program.class);
        List<Program> allPrograms = query.getResultList();

        return allPrograms;
    }

    @Override
    public void save(Program program) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(program);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Program> query = session.createQuery("delete from Program " +
                "where id =:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public Program get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Program program = session.get(Program.class, id);
        return program;
    }
}
