 /*
Program: Take input of age of 3 people by user and determine oldest and youngest among them.
Author: Shayan Akhtar
Date: 20th OCT 2022
*/
//Importin Packsges
import java.util.Scanner;

// Declaring a Class
class OldestYoungest
{
	public static void main(String args[])
		{
		// Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		// Taking Inputs
		System.out.println("Person-1  Enter Your Age :");
		int age1 = sc.nextInt();
		System.out.println("Person-2  Enter Your Age :");
		int age2 = sc.nextInt();
		System.out.println("Person-3  Enter Your Age :");
		int age3 = sc.nextInt();
		
		//Using of If else
			
		if
		((age1>age2)&&(age1>age3))
			System.out.println("The Oldest is Person-1");
		else if 
			(age2>age3)
			 System.out.println("The Oldest is Person-2");
		     
			 else
				 System.out.println("The Oldest is Person-3");
		if
		((age1<age2)&&(age1<age3))
			System.out.println("The Youngest is Person-1");
		else if 
			(age2<age3)
			 System.out.println("The Youngest is Person-2");
		     
			 else
				 System.out.println("The Youngest is Person-3");
				 
			
		}
		//End Of Main
}
//End Of Class