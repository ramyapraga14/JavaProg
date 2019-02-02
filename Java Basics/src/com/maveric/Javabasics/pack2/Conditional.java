package com.maveric.Javabasics.pack2;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1==1);
		System.out.println(1<1);
		
		//if else if statement
		int a = 6;
		if(a>5)
		{
		System.out.println("A is greater than 5");	
		}
		else if (a<5) {
			System.out.println("A is less than 5");
		}
		else {
			System.out.println("A is equal to 5");
		}
		System.out.println("Condition Validated");
		
		//Switch case
		switch(a)
		{
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("No Match");
			break;
		}
		System.out.println("Condition Validated");
		
		//Nested if
		if (a%2==0)
		{
			if(a%3==0) 
			{
				System.out.println("Number is divisible by 6");
			}
			else 
			{
			System.out.println("Number is Even");
			}
		}
		else {
			System.out.println("Number is Odd");
		}
		if(a%2==0 && a%3==0) // && - AND, || - OR
		{
			System.out.println("Divisible by 6");
		}
 	}
	
}
