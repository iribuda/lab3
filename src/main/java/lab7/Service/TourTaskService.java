package lab7.Service;

import lab7.Entity.TourTask;

import java.util.List;

public interface TourTaskService {

    public List<TourTask> getAll();

    public void save(TourTask tourTask);

    public TourTask get(int id);

    public void delete(int id);
}
