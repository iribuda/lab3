package air;

import air.DAO.EmployeeDAO;
import air.DAO.PositionDAO;
import air.entity.*;

public class Test2 {
    public static void main(String[] args) {
        PositionDAO positionDAO = new PositionDAO();
        EmployeeDAO employeeDAO = new EmployeeDAO();

//        Position position = new Position("Sales");
//        positionDAO.save(position);

//        Position position = new Position("Pilot");
//        positionDAO.edit("HR", position);

//        positionDAO.delete(3);

        positionDAO.get(1);
        positionDAO.getAll();

//        Employee employee = new Employee(567899, "Kim Anton", "Green Street");
//        employee.setPosition(positionDAO.get(2));
//        employeeDAO.save(employee);

        employeeDAO.get(6);

//        Employee emp = new Employee(678997, "Kim Andrey", "Blue Street");
//        employeeDAO.edit(7, emp);

        employeeDAO.getAll();
    }
}
