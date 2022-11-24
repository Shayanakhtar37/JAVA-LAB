package com.ques3;

public class Member {
		String name;
		int age;
		int PhoneNumber;
		String address;
		int salary;
		
		void printSalary(int i)
		{
			System.out.println(salary);
		}

	}
	class Employee extends Member
	{
		String Specialization;
		String Department;
	}
	class Manager extends Member
	{
		String Specialization;
		String Department;
}



