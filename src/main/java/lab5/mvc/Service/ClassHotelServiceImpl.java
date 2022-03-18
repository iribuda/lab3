package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.ClassHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClassHotelServiceImpl implements ClassHotelService{
    @Autowired
    private DAO<ClassHotel> classHotelDAO;

    @Override
    @Transactional
    public List<ClassHotel> getAll() {
        return classHotelDAO.getAll();
    }

    @Override
    @Transactional
    public void save(ClassHotel classHotel) {
        classHotelDAO.save(classHotel);
    }
    
    @Override
    @Transactional
    public ClassHotel get(int id) {
        return classHotelDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        classHotelDAO.delete(id);
    }
}
