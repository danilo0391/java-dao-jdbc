package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.impl.DepartmentDaoJDBC;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner (System.in);

        System.out.println("==== TEST 1: department findById ====");
        Department dp = departmentDao.findById(4);
        System.out.println(dp);

        System.out.println("\n==== TEST 2: department deleteById ====");
        System.out.print("Enter id to be deleted: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();

        System.out.println("\n==== TEST 3: department findAll ====");
        List<Department> dpList = departmentDao.findAll();
        for (Department d: dpList) {
            System.out.println(d);
        }

        System.out.println("==== TEST 4: department insert ====");
        Department newDepartment = new Department(null, "Test");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

    }
}
