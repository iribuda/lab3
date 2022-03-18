package lab5.mvc.Service;

import lab5.mvc.Entity.Category;
import lab5.mvc.Entity.Employee;

import java.util.List;

public interface CategoryService {

    public List<Category> getAll();

    public void save(Category category);

    public Category get(int id);

    public void delete(int id);
}
