package com.QuizApplication;

import java.util.Scanner;

public class loginPage extends QuestionClass {
	String password="Quiz@123";
	String userEnteredPassword;
	String y1="Yes";
	public void studentLogIn() {
		System.out.println("please enter password as Quiz@123");
		Scanner scanner=new Scanner(System.in);
		this.userEnteredPassword=scanner.nextLine();
		if(userEnteredPassword.contentEquals(password)) {
			System.out.println("welcome to Consoled Based Quiz Application");
			homePage();
		}
		
	}
	public void homePage() {
		System.out.println("Are YOU READY?   :::::: Yes/No");
		Scanner sc=new Scanner(System.in);
		String y=sc.nextLine();
		if(y.contentEquals(y1)) {
			System.out.println("Great!!!!  May I know your good name ?");
			Scanner s=new Scanner(System.in);
			String studentName=s.nextLine();
			System.out.println("hello"+" "+ studentName+" "+"your quiz is about to start"+" "+"ALL THE BEST!!!!!");
		}else {
			System.out.println("Try to solve Quiz when your MOOD is Good  :)))");
		}
		
		
	}
}
