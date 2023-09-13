package demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
	//	System.out.print("HELLLOO ARTIN");
		
		
		 
		
		Scanner input = new Scanner(System.in);
		System.out.print("PLease enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("PLease enter the second number: ");
		int num2 = input.nextInt();
		int sum = num1*num2;
		System.out.print("After deviding the 2 numbers the answer is: " + sum);
	}

}
     