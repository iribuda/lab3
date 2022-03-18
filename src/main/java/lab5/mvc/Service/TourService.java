package lab5.mvc.Service;

import lab5.mvc.Entity.Tour;

import java.util.List;

public interface TourService {

    public List<Tour> getAll();

    public void save(Tour tour);

    public Tour get(int id);

    public void delete(int id);
}
