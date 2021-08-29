package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("abhishek", "srivastava");
		System.out.println("Enter your department");
		System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String email, password;
		CredentialService credserv = new CredentialService();
		Department dept1 = new Department();
		switch (choice) {
		case 1: 
			dept1.setDeptName("tech");
			email = credserv.generateEmail(emp1, dept1);
			password = credserv.generatePassword();
			credserv.showCredentials(email, password);
			break;
		
		case 2:
			dept1.setDeptName("admin");
			email = credserv.generateEmail(emp1, dept1);
			password = credserv.generatePassword();
			credserv.showCredentials(email, password);
			break;
			
		case 3:
			dept1.setDeptName("hr");
			email = credserv.generateEmail(emp1, dept1);
			password = credserv.generatePassword();
			credserv.showCredentials(email, password);
			break;
			
		case 4:
			dept1.setDeptName("legal");
			email = credserv.generateEmail(emp1, dept1);
			password = credserv.generatePassword();
			credserv.showCredentials(email, password);
			break;
			}

	}

}
