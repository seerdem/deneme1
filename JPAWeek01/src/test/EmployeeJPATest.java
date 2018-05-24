package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import model.Employee;

public class EmployeeJPATest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		// javax.persistence.Persistence sinifi yardimiyla EntityManagerFactory
		// olusturabiliriz.
		// Bunun icin persistence unit bilgisini kullaniriz (persistence.xml)

		// EntityManagerFactoryden N tane EntityManager olusturabiliriz.
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);

		Employee employee1 = new Employee(1, "anil", "yetisgin", 5000);
		Employee employee2 = new Employee(2, "muhammet", "aslan", 5900);
		Employee employee3 = new Employee(3, "suleyman", "can", 1500);
		employeeDAO.insertEmployee(employee1);
		employeeDAO.insertEmployee(employee2);
		employeeDAO.insertEmployee(employee3);

		//

		Employee employeeFound = employeeDAO.getEmployeeById(2);

		System.out.println(employeeFound);

		System.out.println();

		List<Employee> employeeList = employeeDAO.getEmployees();
		
		// employeeList.forEach(System.out::println);
		
		for(Employee e : employeeList) {
			System.out.println(e);
		}
		
		//
		employeeDAO.deleteEmployee(2);
		
		System.out.println("after delete...");
		employeeList = employeeDAO.getEmployees();
		
		// employeeList.forEach(System.out::println);
		
		for(Employee e : employeeList) {
			System.out.println(e);
		}
		//
		System.out.println("after raise...");
		employeeDAO.raiseSalary(1, 2000);
		
		Employee employeeFound2 = employeeDAO.getEmployeeById(1);
		
		System.out.println(employeeFound2);
	}
}
