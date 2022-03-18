package lab5.mvc.Service;

import lab5.mvc.Entity.ClassAvia;

import java.util.List;

public interface ClassAviaService {

    public List<ClassAvia> getAll();

    public void save(ClassAvia classAvia);

    public ClassAvia get(int id);

    public void delete(int id);
}
