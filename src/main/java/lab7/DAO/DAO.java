package lab7.DAO;


import java.util.List;

public interface DAO<T> {

    public  T get(int id);
    public List<T> getAll();
    public  void save(T object);
    public  void delete(int id);

}
