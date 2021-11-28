package com.greatlearning.service;

import java.util.Random;

public class CredentialService {

	public String createEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".gl.com" ;
	}

	public String createPassword() {
		
		String numbers = "0123456789";
		String smallLetters = "abcdefghijklmnopqrstuiwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialChars = "!@#$%^&*";
		String combined = numbers + smallLetters + capitalLetters + specialChars ;
		Random random = new Random();
		
		// temp password makes sure that we have at least one of all the 4 char types.
		char[] tempPassword = new char[8] ;
//		tempPassword[0] = numbers.charAt(random.nextInt(numbers.length()));
//		tempPassword[1] = smallLetters.charAt(random.nextInt(smallLetters.length()));
//		tempPassword[2] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
//		tempPassword[3] = specialChars.charAt(random.nextInt(specialChars.length()));
		for (int i = 0; i<8; i++) {
			tempPassword[i] = combined.charAt(random.nextInt(combined.length()));
		}
		
		// final password randomizes tempPassword.
		char[] password = new char[8] ;
		for (int i=0; i<8; i++) {
			password[i] = tempPassword[random.nextInt(tempPassword.length)];
		}
		System.out.println(password.toString());
		return tempPassword.toString();
		
	}
	
	public void showCredentials(String firstName, String email, String password) {
		System.out.println( String.format("Dear %s your generated credentials are as follows\n"
				+ "Email --->  %s\n"
				+ "Password ---> %s", firstName, email, password));
	}
}
