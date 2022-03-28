package lab7.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab7.DAO.DAO;
import lab7.Entity.ClassAvia;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClassAviaServiceImpl implements ClassAviaService{
    @Autowired
    private DAO<ClassAvia> classAviaDAO;

    @Override
    @Transactional
    public List<ClassAvia> getAll() {
        return classAviaDAO.getAll();
    }

    @Override
    @Transactional
    public void save(ClassAvia classAvia) {
        classAviaDAO.save(classAvia);
    }
    
    @Override
    @Transactional
    public ClassAvia get(int id) {
        return classAviaDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        classAviaDAO.delete(id);
    }
}
