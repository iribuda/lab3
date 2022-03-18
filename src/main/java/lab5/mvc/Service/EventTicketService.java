package lab5.mvc.Service;

import lab5.mvc.Entity.EventTicket;

import java.util.List;

public interface EventTicketService {

    public List<EventTicket> getAll();

    public void save(EventTicket eventTicket);

    public EventTicket get(int id);

    public void delete(int id);
}
