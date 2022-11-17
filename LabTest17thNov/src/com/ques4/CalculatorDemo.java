package com.ques4;

//import packages 
import java.util.Scanner;

public class CalculatorDemo {
	// method to adding 2 numbers (static void)
		static void add(float n1, float n2) 
		{	
		   //adding numbers
		   float sum= n1+n2;
		   System.out.println("The result is : "+sum);
		}
		//end of method of addition
		
		// method to substract 2 numbers (static void)
		static void sub(float n1, float n2)
		{	
		   //substract numbers
		   float sum= n1-n2;
		   System.out.println("The result is : "+sum);
		}
		//end of method of substraction
		
		// method to multiply 2 numbers (static void)
		static void mul(float n1, float n2)
		{	
		   //multiply numbers
		   float result= n1*n2;
		   System.out.println("The result is :"+result);
		}
		//end of method of multiplication
		
		// method to devide 2 numbers (static void)
		static void div(float n1, float n2)
		{	
		   //devide numbers
		   float result= n1/n2;
		   System.out.println("The result is :"+result);
		}

//main started
	public static void main(String args[])
	{
	
	   //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		float num1,num2;
		int choice;
		
		
		//taking input
		System.out.println("Enter the first number : ");
		num1= sc.nextFloat();
		System.out.println("Enter the second number : ");
		num2= sc.nextFloat();
		
		//menu
		System.out.println("1. Add ");
		System.out.println("2. Subtract ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide ");
		System.out.println("5. Exit ");
		System.out.println("Enter your choice :");
		choice= sc.nextInt();
		
		
	   //switch case
	   switch(choice)
	   {
		   case 1:add(num1,num2);
		          break;
		   case 2:sub(num1,num2);
		          break;
		   case 3:mul(num1,num2);
		          break;
		   case 4:div(num1,num2);
		          break;
		   case 5:System.exit(0);
		          break;
		  default: System.out.println("Wrong input");  
	   }
	//end of switch case
	}
	// end of main
}
//end of class 

