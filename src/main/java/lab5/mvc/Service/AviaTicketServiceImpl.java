package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.AviaTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AviaTicketServiceImpl implements AviaTicketService{
    @Autowired
    private DAO<AviaTicket> aviaTicketDAO;

    @Override
    @Transactional
    public List<AviaTicket> getAll() {
        return aviaTicketDAO.getAll();
    }

    @Override
    @Transactional
    public void save(AviaTicket aviaTicket) {
        aviaTicketDAO.save(aviaTicket);
    }
    
    @Override
    @Transactional
    public AviaTicket get(int id) {
        return aviaTicketDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        aviaTicketDAO.delete(id);
    }
}
