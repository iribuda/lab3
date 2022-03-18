package lab5.mvc.Service;

import lab5.mvc.DAO.DAO;
import lab5.mvc.Entity.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProgramServiceImpl implements ProgramService{
    @Autowired
    private DAO<Program> programDAO;

    @Override
    @Transactional
    public List<Program> getAll() {
        return programDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Program program) {
        programDAO.save(program);
    }
    
    @Override
    @Transactional
    public Program get(int id) {
        return programDAO.get(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        programDAO.delete(id);
    }
}
