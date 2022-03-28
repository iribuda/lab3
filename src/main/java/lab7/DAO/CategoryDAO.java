package lab7.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lab7.Entity.Category;

import java.util.List;

@Repository
public class CategoryDAO implements DAO<Category>{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Category get(int id) {
        Session session = sessionFactory.getCurrentSession();
        Category category = session.get(Category.class, id);
        return category;
    }

    @Override
    public List<Category> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Category> query = session.createQuery("from Category", Category.class);
        List<Category> categories = query.getResultList();
        return categories;
    }

    @Override
    public void save(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(category);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Category> query = session.createQuery("delete from Category " +
                "where id =:categoryId");
        query.setParameter("categoryId", id);
        query.executeUpdate();
    }
}
