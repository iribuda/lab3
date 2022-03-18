package lab5.mvc.Service;

import lab5.mvc.Entity.Contract;

import java.util.List;

public interface ContractService {

    public List<Contract> getAll();

    public void save(Contract contract);

    public Contract get(int id);

    public void delete(int id);
}
