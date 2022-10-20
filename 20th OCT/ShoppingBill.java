 /*
Program: WAP to give 10% discount to the user whose shopping bill id greater than 2000.(ask the qty , cost of one unit is 540)
Author: Shayan Akhtar
Date: 20th OCT 2022
*/
//Import Packages 
import java.util.Scanner;
//Declaring a Class
class ShoppingBill
{
	public static void main(String args[])
	{
		// Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Quantity");
		//Taking Input
		int num = sc.nextInt();
		int sum = num*540;
		int sum2 = num*54; // For Using 10% Discount
		int sum3 = sum-sum2; // For Using 10% Discount
		
		if
		(sum>2000)
			System.out.println("You are Eligible For 10% Discount Final Bill is :"+sum3);	
		else 
		   System.out.println("Your Bill is :"+sum);
	}
	//End Of Main
}
//End Of Class
		