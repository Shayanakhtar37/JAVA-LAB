/*
 * Employee Info
 * Author: Shayan Akhtar
 * Date:26 Oct 2022
 */

package com.ques2.test;

import java.util.Scanner;

// importing Employee package
import com.ques2.Employe;


//declaring a class
public class Test {

		// main method
		public static void main(String[] args) {

			// creating object of employee class
			Employe e1 = new Employe();
			// declaring an object of Scanner
			Scanner sc = new Scanner(System.in);
			
			// creating object of employee2 class
			Employe e2 = new Employe();
		

			// declaring variables
			int id;
			int salary;
			String name, department;

			// taking input
			System.out.println("Enter the Employee Name: ");
			name = sc.nextLine();
			System.out.println("Enter the Employee Id: ");
			id = sc.nextInt();
			System.out.println("Enter the Employee Department: ");
			department = sc.next();
			System.out.println("Enter the Employee Salary: ");
			salary = sc.nextInt();

			// call the method getDetails
			e1.getDetails(id, name, department, salary);
			
			// taking input
			System.out.println("Enter the Employee Name: ");
			name = sc.next();
			System.out.println("Enter the Employee Id: ");
		    id = sc.nextInt();
			System.out.println("Enter the Employee Department: ");
			department = sc.next();
			System.out.println("Enter the Employee Salary: ");
			salary = sc.nextInt();
			
			// call the method getDetails
			e2.getDetails(id, name, department, salary);

			//// call the method printDetails()

			e1.printDetailsemp1();
			e2.printDetailsemp2();
			sc.close();
		}
	}
