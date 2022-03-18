package lab5.mvc.DAO;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public interface DAO<T> {

    public  T get(int id);
    public List<T> getAll();
    public  void save(T object);
    public  void delete(int id);

}
