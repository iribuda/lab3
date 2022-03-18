package lab5.mvc.Service;

import lab5.mvc.Entity.Hotel;

import java.util.List;

public interface HotelService {

    public List<Hotel> getAll();

    public void save(Hotel hotel);

    public Hotel get(int id);

    public void delete(int id);
}
