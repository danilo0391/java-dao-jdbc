package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.impl.DepartmentDaoJDBC;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
    }
}
