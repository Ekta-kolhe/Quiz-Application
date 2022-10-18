package com.QuizApplication;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Student {
	private String stdPasskey;
	private int stdId;
	private int marks;
	private String stdName;
	public String getStdPasskey() {
		return stdPasskey;
	}
	public void setStdPasskey(String stdPasskey) {
		this.stdPasskey = stdPasskey;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public ArrayList<Student> getAl() {
		return al;
	}
	public void setAl(ArrayList<Student> al) {
		this.al = al;
	}
	HashMap <Integer, String>hashmapobj = new HashMap();
	ArrayList <Student>al=new ArrayList<Student>();
	Student(){
		stdId=0;
		stdPasskey=" ";
		marks=0;
		stdName=" ";
	}
	Student(int id, String Name, String passkey ){
		stdId=id;
		stdPasskey=passkey;
		stdName=Name;
	}
	public void register() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id");
		int id=sc.nextInt();
		System.out.println("Enter student Name");
		sc.hasNext();
		String name=sc.next();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter student Password");
		sc1.hasNext();
		String passwd=sc1.nextLine();
		al.add(new Student(id, name, passwd));
		hashmapobj.put(id,passwd);
		}
	public void showmap() {
		
	}
	public void showStudents()
	{ //System.out.println("Id>>"+s.stdId+" Name:"+s.stdName);
		
		for(Student s:al) {
		System.out.println("Id>>"+s.getStdId()+" Name:"+s.getStdName()+" Marks="+s.getMarks());//stdId+" Name:"+s.stdName);
	}
		}

	public boolean checkLogin() {
		boolean pass=false; 
		String passwd;
		//int id; String key;
		System.out.println("Enter student id");
		Scanner sc = new Scanner(System.in);
		stdId=sc.nextInt();
		//if(this.stdId==101)
		//if(al.contains(this.getStdId()))
		if(hashmapobj.containsKey(this.getStdId()))
		{
			System.out.println("Enter student password");
			stdPasskey=sc.next();
			passwd=hashmapobj.get(stdPasskey);
			System.out.println(" from hashmap="+passwd);
			if(stdPasskey.equals(hashmapobj.get(stdPasskey))) {
				System.out.println(" student logged in successfully..");
				pass=true;
				// marks=quiz(stdID)
				//hashmap  OR Database insert stdID & marks table(marks)
			}else {
				System.out.println("student password wrong");
				pass=false;
				}
					
		}else {System.out.println("student username wrong ");
			pass=false;
		}
		return pass;
		//sc.close();
	}
}
