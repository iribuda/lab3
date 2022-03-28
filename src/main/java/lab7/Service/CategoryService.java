package lab7.Service;

import lab7.Entity.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> getAll();

    public void save(Category category);

    public Category get(int id);

    public void delete(int id);
}
