package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.utils.Constants;

import java.util.Scanner;

public class DriverClass {

	static Employee employee = new Employee("Meghaj", "Patil") ;
	
	public static void main(String[] args) {
			
		System.out.println("Please choose your department:\n" 
					+ "1. Technical\n"
					+ "2. Admin\n"
					+ "3. Human Resource\n"
					+ "4. Legal");
			
			
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		Scanner sc = new Scanner(System.in);
		int chosenOption = sc.nextInt();
		
		String department = "" ; 
		
		if (chosenOption == 1){
			department = Constants.TECHNICAL_DEPARTMENT ;
		}else if (chosenOption == 2){
			department = Constants.ADMIN_DEPARTMENT ;
		}else if(chosenOption == 3){
			department = Constants.HR_DEPARTMENT ;
		}else if(chosenOption == 4){
			department = Constants.LEGAL_DEPARTMENT ;
		}else {
			System.out.println("Invalid Choice");
		}
			
		CredentialService credentials = new CredentialService();
		String emailAddress = credentials.createEmailAddress(firstName, lastName, department) ;
		String password = credentials.createPassword() ;
			
		credentials.showCredentials(firstName, emailAddress, password);
			
	}
		
}
