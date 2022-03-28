package lab7.Service;

import lab7.DAO.DAO;
import lab7.Entity.EventTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EventTicketServiceImpl implements EventTicketService{
    @Autowired
    private DAO<EventTicket> eventTicketDAO;

    @Override
    @Transactional
    public List<EventTicket> getAll() {
        return eventTicketDAO.getAll();
    }

    @Override
    @Transactional
    public void save(EventTicket eventTicket) {
        eventTicketDAO.save(eventTicket);
    }
    
    @Override
    @Transactional
    public EventTicket get(int id) {
        return eventTicketDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        eventTicketDAO.delete(id);
    }
}
