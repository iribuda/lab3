package lab5.mvc.Service;

import lab5.mvc.Entity.AviaTicket;
import lab5.mvc.Entity.Employee;

import java.util.List;

public interface AviaTicketService {

    public List<AviaTicket> getAll();

    public void save(AviaTicket aviaTicket);

    public AviaTicket get(int id);

    public void delete(int id);
}
