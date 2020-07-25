package com.simplilearn.typecasting;

public class NonConvartable {

	public static void main(String[] args) {
		// Cannot Convert char or boolean to other types
		
		char firstCharacter = 'c';
		
		int number = 100;
		
		firstCharacter = (char) number;
		
		System.out.println(firstCharacter);
		
		

	}

}
