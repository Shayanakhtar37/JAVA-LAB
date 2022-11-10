//Create a record of students using array in java.
 
package com.ques1;
//Import Scanner 
import java.util.Scanner;

//Create Class 
public class StudentArray {
	
	//Create Scanner Class Object
	static Scanner sc = new Scanner(System.in);
	
	//Declaring Variables
	int id;
	String name,dept,grade;
	
	//Method to get Student Details
	void getData()
	{
		System.out.println("Enter Student Name:");
		name = sc.next();
		System.out.println("Enter Student ID:");
		id = sc.nextInt();
		System.out.println("Enter Student's Department:");
		dept = sc.next();
		System.out.println("Enter Student's Grade:");
		grade = sc.next();
	}
	
	//Method to display Student Details
	void display()
	{
		System.out.println("Student's Name: "+name);
		System.out.println("Student's ID: "+id);
		System.out.println("Student's Department: "+dept);
		System.out.println("Student's Grade: "+grade);
		
	}

	//Main Method
	public static void main(String[] args) {
		
		//Declaring Variables
		int i,n;
		System.out.println("Enter no. of students do you have:");
		n = sc.nextInt();
		
		//Creating object of StudentRecord class
		StudentArray obj[] = new StudentArray[n];
		
		//This loop is for entering student details
		for(i=0;i<n;i++)
		{
			obj[i] = new StudentArray();//creating obj[0],obj[1],obj[2]......as object of StudentRecord class
			System.out.println("\nEnter data of Student "+(i+1));
			obj[i].getData();
		}
		
		System.out.println("****************************************************");
		System.out.println("Student Details:");
		System.out.println("----------------------------------------------");
		
		//This loop is for get student Details
		for(i=0;i<n;i++)
		{
			obj[i].display();
			System.out.println("-------------------------------------------");
		}

	}//End of Main

}//End of class