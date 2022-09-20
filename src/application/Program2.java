package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("\n Test 1: department findById");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findById(1);
		
		System.out.println(dep);
		
		System.out.println("\n Test 2: department findAll");
		
		List<Department> list = departmentDao.findAll();
		
		for(Department department : list) {
			System.out.println(department);
		}

	}

}
