package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Test 1: department findById");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findById(1);
		
		System.out.println(dep);
		
		System.out.println("\n Test 2: department findAll");
		
		List<Department> list = departmentDao.findAll();
		
		for(Department department : list) {
			System.out.println(department);
		}
		
		//System.out.println("\n Test 3: department insert");
		
		//Department department = new Department(null, "Desenvolvedores");
		//departmentDao.insert(department);
		//System.out.println("Done! Row create: " + department.getId());
		
		//System.out.println("\n Test 4: department update");
		
		//Department department = new Department(null, "TI");
		//departmentDao.update(department);
		//System.out.println("Update complete");
		
		System.out.println("\n Test 5: department delete");
		
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete complete");
		

	}

}
