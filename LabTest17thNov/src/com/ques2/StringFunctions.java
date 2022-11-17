package com.ques2;

import java.util.Scanner;

public class StringFunctions {

		Scanner sc = new Scanner(System.in);
		
		void upperCase()
		{
			String str1="welcome in java";
			System.out.println(str1.toUpperCase());
		}
		void Length()
		{
			String str2="I am from Ranchi, Jharkhand";
			System.out.println("Length of String: "+str2.length());
		}
		void IndexOf()
		{
			String str3 = "The best is yet to come";
			System.out.println(str3.indexOf("yet"));
		}
		void CharAt()
		{
			String str4 = "Never give up";
			System.out.println(str4.charAt(6));
		}
		void Equals()
		{
			String Str5 = "Hello";
			String Str6 = "Hello";
			String Str7 = "Hii";
			System.out.println(Str5.equals(Str6)); // Returns true because they are equal
			System.out.println(Str5.equals(Str7)); // false
		}

		public static void main(String[] args) {
			
			
			StringFunctions obj = new StringFunctions();
			obj.upperCase();
			obj.Length();
			obj.IndexOf();
			obj.CharAt();
			obj.Equals();
			

		}

	}

