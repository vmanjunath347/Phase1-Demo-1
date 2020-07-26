package com.simplilearn.typecasting;

public class StringConversion {

	public static void main(String[] args) {
		
		String price = "100";
		
		int priceInt  = Integer.parseInt(price);
		
		System.out.println(price);
		
		System.out.println(priceInt);
		
		int num = 10;
		
		byte numByte = 20;
		
		
		String data = String.valueOf(num);
		
		String data2 = String.valueOf(numByte);
		
		System.out.println("The String value :"+data2);
		

	}

}
