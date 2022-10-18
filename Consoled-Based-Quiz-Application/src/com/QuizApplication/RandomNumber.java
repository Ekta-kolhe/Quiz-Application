package com.QuizApplication;
import java.util.Random; 
public class RandomNumber {
	public  void generateMethod() 
	{   // creating an object of Random class   
	Random random = new Random();   
	// Generates random integers 0 to 9  
	//for(i=0 to 9)
	int x = random.nextInt(10);   
	//select * from QuizTable where Qid==(i) (1 to 10)
	// Generates random integers 0 to 999  
	int y = random.nextInt(1000);   
	// Prints random integer values  
	System.out.println("Randomly Generated Integers Values");  
	System.out.println(x);   
	System.out.println(y);  
	}
}
