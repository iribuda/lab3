package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    private DAO<Event> eventDAO;

    @Override
    @Transactional
    public List<Event> getAll() {
        return eventDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Event event) {
        eventDAO.save(event);
    }
    
    @Override
    @Transactional
    public Event get(int id) {
        return eventDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        eventDAO.delete(id);
    }
}
