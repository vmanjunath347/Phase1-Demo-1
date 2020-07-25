package com.simplilearn.typecasting;

public class FirstTypeDemo {

	public static void main(String[] args) {
		
		// Widening or Automatic Conversion or Implicit Typecasting
		// Byte -> Short  -> Int  -> Long -> Float -> Double
		byte countByte = 127;
				
		int count  = 100;
		
		long countBig = count;
		
		float countFp = countBig;
		
		double countDecimal = countFp;
		
		double byteToDouble = countByte;
		
//		int  doubleToInt = byteToDouble;
		
		System.out.println("Int value :"+count);
		System.out.println("Long value :"+countBig);
		System.out.println("Float Value :"+countFp);
		System.out.println("Double Value :"+countDecimal);
		
		
		
		
		
		
		
		
		
		
	}

}
