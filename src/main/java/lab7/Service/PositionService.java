package lab7.Service;

import lab7.Entity.Position;

import java.util.List;

public interface PositionService {

    public List<Position> getAll();

    public void save(Position position);

    public Position get(int id);

    public void delete(int id);
}
