package lab7.Service;

import lab7.Entity.Tour;

import java.util.List;

public interface TourService {

    public List<Tour> getAll();

    public void save(Tour tour);

    public Tour get(int id);

    public void delete(int id);
}
