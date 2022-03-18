package lab5.mvc.Service;

import lab5.mvc.Entity.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getAll();

    public void save(Room room);

    public Room get(int id);

    public void delete(int id);
}
