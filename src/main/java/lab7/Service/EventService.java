package lab7.Service;

import lab7.Entity.Event;

import java.util.List;

public interface EventService {

    public List<Event> getAll();

    public void save(Event event);

    public Event get(int id);

    public void delete(int id);
}
