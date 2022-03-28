package lab7.Service;

import lab7.DAO.DAO;
import lab7.Entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private DAO<Position> positionDAO;

    @Override
    @Transactional
    public List<Position> getAll() {
        return positionDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Position position) {
        positionDAO.save(position);
    }
    
    @Override
    @Transactional
    public Position get(int id) {
        return positionDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        positionDAO.delete(id);
    }
}
