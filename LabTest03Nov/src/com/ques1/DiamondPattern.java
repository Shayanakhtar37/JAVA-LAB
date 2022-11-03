/*
 * Wap to print diamond shape
 * Author: Shayan Akhtar
 * Date: 03rd NOV 2022
 */

//declaring package
package com.ques1;

//importing scanner
import java.util.Scanner;

//declaring a class
public class DiamondPattern{
	
	static void print(int rows){
		int j;
		for (int i = 1; i <= rows; i++) {
			System.out.println();
			// inner loop for spaces
			for (j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}

			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
		}
	}//end of print
	
	static void print1(int rows){
		int j;
		for (int i = 1; i >= rows; i--) {
			System.out.println();
			// inner loop for spaces
			for (j = rows - 1; j >= i; j--) {
				System.out.print(" ");
			}

			// inner loop to print star
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
		}
	}//end of print2
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter The Number of Rows");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		print(n);
		print1(n);
		sc.close();
	}//end of main
}
//end of class

   