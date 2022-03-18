package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private DAO<Hotel> hotelDAO;

    @Override
    @Transactional
    public List<Hotel> getAll() {
        return hotelDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Hotel hotel) {
        hotelDAO.save(hotel);
    }
    
    @Override
    @Transactional
    public Hotel get(int id) {
        return hotelDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        hotelDAO.delete(id);
    }
}
