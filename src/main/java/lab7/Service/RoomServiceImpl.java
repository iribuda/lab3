package lab7.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab7.DAO.DAO;
import lab7.Entity.Room;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{
    @Autowired
    private DAO<Room> roomDAO;

    @Override
    @Transactional
    public List<Room> getAll() {
        return roomDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Room room) {
        roomDAO.save(room);
    }
    
    @Override
    @Transactional
    public Room get(int id) {
        return roomDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        roomDAO.delete(id);
    }
}
