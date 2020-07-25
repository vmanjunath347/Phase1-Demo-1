package com.simplilearn.typecasting;

public class ExplicitTypeCastDemo {

	public static void main(String[] args) {
		// Explicit Type Cast or Narrowing 
		// Double -> float  -> Long -> Int -> Short -> Byte
		
		double price = 100.49;
		
		long priceLong = (long) price;
		
		int priceInt = (int) priceLong;
		
		byte priceByte = (byte) priceInt;
		
		System.out.println("Double Price Value :" +price);
		System.out.println("Long Price Value :" +priceLong);
		System.out.println("Int Price Value :" +priceInt);
		System.out.println("Byte Price Value :" +priceByte);

	}

}
