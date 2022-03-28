package lab7.Service;


import lab7.Entity.ClassAvia;

import java.util.List;

public interface ClassAviaService {

    public List<ClassAvia> getAll();

    public void save(ClassAvia classAvia);

    public ClassAvia get(int id);

    public void delete(int id);
}