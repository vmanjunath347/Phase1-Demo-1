package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConvBasedOnUserInput {

	public static void main(String[] args) {
		
		// User Input From Console
		
		// Scanner For user Input
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter a number 1 -100 : ");
		
		String userNumber = input.nextLine();
		
		
		int userIntValue  = Integer.parseInt(userNumber);
		
		double userDoubleValue  = Double.parseDouble(userNumber);
		
		long userLongValue  = Long.parseLong(userNumber);
		
		byte userByteValue = Byte.parseByte(userNumber);
		
		System.out.println("User Input as Interger : "+userIntValue);
		System.out.println("User Input as Double : "+userDoubleValue);
		System.out.println("User Input as Long : "+userLongValue);
		System.out.println("User Input as Byte : "+userByteValue);
		
//		--------------------------
//		 	Scanner input = new Scanner(System.in);
//	        System.out.println("Enter the Integer Value which I will convert into float, double and byte:  ");
//	        int userInput = input.nextInt();
//	        
//	        float floatInput = userInput;
//	        double doubleInput = userInput;
//	        byte byteInput = (byte) userInput;
//	        System.out.println("The default input of the value as an Integer is " + userInput);
//	        System.out.println("The converted Float value as an Integer is " + floatInput);
//	        System.out.println("The converted Double value as an Integer is " + doubleInput);
//	        System.out.println("The converted Byte value as an Integer is " + byteInput);
		
		

	}

}
