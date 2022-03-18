package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private DAO<Order> orderDAO;

    @Override
    @Transactional
    public List<Order> getAll() {
        return orderDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Order order) {
        orderDAO.save(order);
    }
    
    @Override
    @Transactional
    public Order get(int id) {
        return orderDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        orderDAO.delete(id);
    }
}
