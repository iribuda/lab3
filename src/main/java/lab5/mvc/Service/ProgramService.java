package lab5.mvc.Service;

import lab5.mvc.Entity.Program;

import java.util.List;

public interface ProgramService {

    public List<Program> getAll();

    public void save(Program program);

    public Program get(int id);

    public void delete(int id);
}
