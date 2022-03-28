package lab7.Service;

import lab7.Entity.Country;

import java.util.List;

public interface CountryService {

    public List<Country> getAll();

    public void save(Country country);

    public Country get(int id);

    public void delete(int id);
}
