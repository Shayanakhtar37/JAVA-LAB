package com.ques1;

import java.util.Scanner;
public class LMUniversity {
	
	static void menu()
	{
		System.out.println("--------Welcome To LearnMore University --------");
		System.out.println("  ");
		System.out.println("Select Your Choice For Uploading Details");
		System.out.println("1. For Student");
		System.out.println("2. For Employee");
	}
	
	static void getSdetails() {
	
		          String fname, lname, course;
		          int age, sid ;
		           
		          Scanner sc = new Scanner(System.in);
		           
		          System.out.print("Enter First Name : ");
		          fname=sc.nextLine();
		          System.out.print("Enter Last Name : ");
		          lname=sc.nextLine();
		          System.out.print("Enter Your AGE : ");
		          age=sc.nextInt();
		          System.out.print("Enter Your Student ID : ");
		          sid=sc.nextInt();
		          System.out.print("Enter Your Course : ");
		          course=sc.next();
		        
		           
		          System.out.println("Name : "+fname+""+lname);
		          System.out.println("Age : "+age);
		          System.out.println("Student ID : "+sid);
		          System.out.println("Course : "+course);
		      }
	
	static void getEdetails() {
				
				  String fnamee, lnamee, dname, des;
				  int agee, eid , sal;
				  
				  Scanner sc = new Scanner(System.in);
				  
				  System.out.print("Enter First Name : ");
		          fnamee=sc.nextLine();
		          System.out.print("Enter Last Name : ");
		          lnamee=sc.nextLine();
		          System.out.print("Enter Your AGE: ");
		          agee=sc.nextInt();
		          System.out.print("Enter Your Employee ID : ");
		          eid=sc.nextInt();
		          System.out.print("Enter Your Department : ");
		          dname=sc.next();
		          System.out.print("Designation : ");
		          des=sc.next();
		          System.out.print("Enter Your Salary : ");
		          sal=sc.nextInt();
		          
		          System.out.println("Name : "+fnamee+" "+lnamee);
		          System.out.println("Age : "+agee);
		          System.out.println("Employee ID : "+eid);
		          System.out.println("Department : "+dname);
		          System.out.println("Designation : "+des);
		          System.out.println("Salary : "+sal);
			}
		    
		public static void main (String args[]) {
			
				//declaring the object of scanner
				Scanner sc = new Scanner(System.in);
				
				//calling menu method
				menu();	
				
				//declaring variables for choice
				int choice;
				
				System.out.println("Enter You Choice:");
				choice= sc.nextInt();	
				
				if (choice==1)
					getSdetails();
				else
					getEdetails();	
				sc.close();	
		}
}
	


