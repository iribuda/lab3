package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TourServiceImpl implements TourService{
    @Autowired
    private DAO<Tour> tourDAO;

    @Override
    @Transactional
    public List<Tour> getAll() {
        return tourDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Tour tour) {
        tourDAO.save(tour);
    }
    
    @Override
    @Transactional
    public Tour get(int id) {
        return tourDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        tourDAO.delete(id);
    }
}
