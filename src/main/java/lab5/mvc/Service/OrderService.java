package lab5.mvc.Service;

import lab5.mvc.Entity.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getAll();

    public void save(Order order);

    public Order get(int id);

    public void delete(int id);
}
