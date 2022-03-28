package lab7.Service;

import lab7.Entity.Contract;

import java.util.List;

public interface ContractService {

    public List<Contract> getAll();

    public void save(Contract contract);

    public Contract get(int id);

    public void delete(int id);
}
