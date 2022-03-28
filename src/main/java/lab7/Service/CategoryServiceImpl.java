package lab7.Service;

import lab7.DAO.DAO;
import lab7.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private DAO<Category> categoryDAO;

    @Override
    @Transactional
    public List<Category> getAll() {
        return categoryDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Category category) {
        categoryDAO.save(category);
    }

    @Override
    @Transactional
    public Category get(int id) {
        return categoryDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        categoryDAO.delete(id);
    }
}
