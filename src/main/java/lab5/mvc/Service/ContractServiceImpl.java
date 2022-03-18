package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ContractServiceImpl implements ContractService{
    @Autowired
    private DAO<Contract> contractDAO;

    @Override
    @Transactional
    public List<Contract> getAll() {
        return contractDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Contract contract) {
        contractDAO.save(contract);
    }
    
    @Override
    @Transactional
    public Contract get(int id) {
        return contractDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        contractDAO.delete(id);
    }
}
