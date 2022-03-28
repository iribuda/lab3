package lab7.Service;

import lab7.Entity.AviaTicket;

import java.util.List;

public interface AviaTicketService {

    public List<AviaTicket> getAll();

    public void save(AviaTicket aviaTicket);

    public AviaTicket get(int id);

    public void delete(int id);
}
