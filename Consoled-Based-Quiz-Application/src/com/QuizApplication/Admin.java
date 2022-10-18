package com.QuizApplication;
import java.util.Scanner;
public class Admin {
	boolean pass=false;
	public boolean adminLogin() {
	String passkey;
	Scanner sc= new Scanner(System.in);
	System.out.println("ENter Username");
	String username=sc.next();
	if(username.equalsIgnoreCase("Admin")) {
		System.out.println("ENter Password");
		passkey=sc.next();
		if(passkey.equals("Admin123") ){
			System.out.println("Admin logged in successfully");	
			pass=true;
		}
		else{
			System.out.println("Invalid Password");
			pass=false;
		}
	}
		else {
			System.out.println("Invalid username");
			pass=false;
		}
	return pass;
	}
}
