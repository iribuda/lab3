package lab5.mvc.Service;

import lab5.mvc.Entity.Event;

import java.util.List;

public interface EventService {

    public List<Event> getAll();

    public void save(Event event);

    public Event get(int id);

    public void delete(int id);
}
