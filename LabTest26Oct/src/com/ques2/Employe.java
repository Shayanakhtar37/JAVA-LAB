/*
 * Employee Info
 * Author: Shayan Akhtar
 * Date:26 Oct 2022
 */

package com.ques2;

//declaring a class
public class Employe {

 // taking variables
	String name;
	int eid;
	int salary;
	String department;

	// method to get the details
	public void getDetails(int id, String n, String d, int sal)
	{
		eid = id;
		name = n;
		department = d;
		salary = sal;
	}//end of method
	
	// method for printing details
	public void printDetailsemp1() 
	{
		System.out.println("-------------------------Employee Details Are------------------------");
		System.out.println("Employee 1 ");
		System.out.println("Employee Name:" + name);
		System.out.println("Employee ID:" + eid);
		System.out.println("Employee Department:" + department);
		System.out.println("Employee Salary:" + salary);

	}//end of method
	
	public void printDetailsemp2() 
	{
		System.out.println("-------------------------Employee Details Are------------------------");
		System.out.println("Employee 2 ");
		System.out.println("Employee Name:" + name);
		System.out.println("Employee ID:" + eid);
		System.out.println("Employee Department:" + department);
		System.out.println("Employee Salary:" + salary);

	}//end of method
}
//end of class