package com.QuizApplication;
import java.util.Scanner;
public class JavaQuiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Student s=new Student();
		do {System.out.println("1. Admin Login \n"+
							"2. Student Login");
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			Admin a=new Admin();
			boolean pass1;
			pass1=a.adminLogin();
			if(pass1) {
				// call admin functions like add/delete students/display marks
				//display students list
				System.out.println("Displaying Student details");
				s.showStudents();
				
				
			}
			break;
		case 2: 
			//Student s=new Student();
			System.out.println("1.Register \n 2.Login");
			Scanner scn=new Scanner(System.in);
			int choice1=scn.nextInt();
			switch(choice1) {
			case 1:
			System.out.println("Do register First");
			s.register();
			s.showStudents();
			break;
			case 2:
			
			boolean pass2;
			pass2=s.checkLogin();
			if(pass2) {
				//start quiz for student
				//creating data base connection
				
			}
			}
			break;
		case 3:
			RandomNumber rn=new RandomNumber();
			rn.generateMethod();
			break;
		case 4: System.out.println("Exit the system");
			System.exit(0);
		}
		}while(choice!=4);
		
	}
}
