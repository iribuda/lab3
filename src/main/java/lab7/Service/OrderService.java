package lab7.Service;

import lab7.Entity.Order;

import java.util.List;

public interface OrderService {

    public List<Order> getAll();

    public void save(Order order);

    public Order get(int id);

    public void delete(int id);
}
