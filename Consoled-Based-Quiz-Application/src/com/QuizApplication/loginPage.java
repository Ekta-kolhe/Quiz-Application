package com.QuizApplication;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
		
		
			
			//This method check weather user have LogIn or Not 
			//If not then user need to Register Here First
		     void AddDetail() {
		    	 System.out.println("LogIn here- Enter 1 ");
		    	 System.out.println("Register here- Enter 2");
		    //	 for(int x=1;x<=2;x++) {
		    		Scanner sc = new Scanner(System.in);
		    		int P =sc.nextInt();
		    		if(P==1){
		    			
		    			
		    			 System.out.println("Please Enter USERNAME");
						 Scanner sc2=new Scanner(System.in);
						 String username = sc2.nextLine();
						 System.out.println("Please Enter password");
						 Scanner sc3=new Scanner(System.in);
						 String password = sc3.nextLine();
		    		
		    		//	 System.out.println("Please Enter PASSWORD");
		    		//	 String password = sc.nextLine();
		    			 
		    			 String T=null;
		    				try {
		   					Class.forName("com.mysql.cj.jdbc.Driver");
		   					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdata","root","Ektamangala@123");
		   					PreparedStatement stmt = conn.prepareStatement("SELECT * FROM USERINFO WHERE USERNAME LIKE ?");
		   					stmt.setString(1,username);
		   					ResultSet rs = stmt.executeQuery();
		   					while(rs.next()) {
		   						String UI = rs.getString(2);
		   						String PASS = rs.getString(3);
		   						System.out.println("from database -" + UI); 
		   	   					System.out.println("from database -" + PASS);
		   	   					System.out.println("from user -" + username);
		   	   					System.out.println("from user -" + password);
		   	   					if ((UI.equals(username)) && (PASS.equals(password))){
		   	   					System.out.println("Successfully LogIn With Uername :" + UI); 
		   	   					}else {
		   						System.out.println("Invalid Username,Passowrd OR Not A Registereg Candidate");
		   	   					}
		       }
		   					
		    				conn.close();
		 }   				
		    			 catch(Exception e) {
		    				 e.printStackTrace();
		    				 
		    			 }
		    		}else {
		    			
		    			System.out.println("Register Here : ");
		    			try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdata","root","Rohit@4436");
							PreparedStatement stmt = conn.prepareStatement("INSERT INTO USERINFO(FULLNAME,USERNAME,PASSWORD)VALUES(?,?,?)");
							System.out.println("Enter the number of Students");
							int p1 = sc.nextInt();
							for(int i=1;i<=p1;i++) {
								//Scanner sc2= new Scanner(System.in);
								String c2 = sc.nextLine();
								String c3= sc.nextLine();
								String c4 = sc.nextLine();
							
								stmt.setString(1, c2);
								stmt.setString(2, c3);
								stmt.setString(3, c4);
								int j = stmt.executeUpdate();
								System.out.println(j);
							
						}
							System.out.println("Registered Successfully.....");
							
							conn.close();
						    stmt.close();
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		    		}		
		    	
		    		  

			
			
			
			//public static void main(String[] args) {
			     //   Quiz1 k = new Quiz1();
			       // k.AddDetail();
			}

	
}
