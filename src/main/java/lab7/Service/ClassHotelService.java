package lab7.Service;

import lab7.Entity.ClassHotel;

import java.util.List;

public interface ClassHotelService {

    public List<ClassHotel> getAll();

    public void save(ClassHotel classHotel);

    public ClassHotel get(int id);

    public void delete(int id);
}
