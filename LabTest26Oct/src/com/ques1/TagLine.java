/*
 * TagLine
 * Author: Shayan Akhtar
 * Date:26 Oct 2022
 */

package com.ques1;

//import packages 
import java.util.Scanner;

//declairing a class
public class TagLine {

//method to print tagline
	static void printTag(String tag) //dummy argument
	{
		 switch(tag)
	   {
		 case "tcs" : System.out.println("Building on Belief.");
					break;
         case "wipro" : System.out.println("Applying Thoughts");	
					break; 
         case "accenture" : System.out.println("High Performance Delivered");		     
					break;		
         case "cognizant" : System.out.println("Keep Challenging");		     
			break;	
         default : System.out.println("Wrong input");						
	   } 
	   //end of switch case
	}	
	//end of method
	
	//main started
		public static void main(String args[])
		{
	       //taking variable
		   String inputTag;
		   
		    //declaring the object of scanner
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter IT Company (tcs,wipro,accenture,cognizant):");
			inputTag= sc.next().toLowerCase();// .toLowerCase - Its use to converting the input to lowercase
		   
		   //calling method
		  printTag(inputTag);
		
		}
		// end of main
	}
	// end of class 