package lab5.mvc.Service;

import lab5.mvc.Entity.Position;

import java.util.List;

public interface PositionService {

    public List<Position> getAll();

    public void save(Position position);

    public Position get(int id);

    public void delete(int id);
}
