package lab7.Service;

import lab7.Entity.EventTicket;

import java.util.List;

public interface EventTicketService {

    public List<EventTicket> getAll();

    public void save(EventTicket eventTicket);

    public EventTicket get(int id);

    public void delete(int id);
}
