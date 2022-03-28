package lab7.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab7.DAO.DAO;
import lab7.Entity.Country;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private DAO<Country> countryDAO;

    @Override
    @Transactional
    public List<Country> getAll() {
        return countryDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Country country) {
        countryDAO.save(country);
    }

    @Override
    @Transactional
    public Country get(int id) {
        return countryDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        countryDAO.delete(id);
    }
}