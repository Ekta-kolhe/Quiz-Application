package com.QuizApplication;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Connection;

public class QuestionClass {
	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb","root","Ektamangala@123");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from quizdb.quizquestion");
			while(rs.next()) {
				System.out.print(rs.getString(1)+" ");
				System.out.println(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getString(5)+" ");
				System.out.println(rs.getString(6));
				
				
				
				
			}
			conn.close();
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
