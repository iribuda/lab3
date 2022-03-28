package lab7.Service;

import lab7.DAO.DAO;
import lab7.Entity.TourTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TourTaskServiceImpl implements TourTaskService{
    @Autowired
    private DAO<TourTask> tourTaskDAO;

    @Override
    @Transactional
    public List<TourTask> getAll() {
        return tourTaskDAO.getAll();
    }

    @Override
    @Transactional
    public void save(TourTask tourTask) {
        tourTaskDAO.save(tourTask);
    }
    
    @Override
    @Transactional
    public TourTask get(int id) {
        return tourTaskDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        tourTaskDAO.delete(id);
    }
}
