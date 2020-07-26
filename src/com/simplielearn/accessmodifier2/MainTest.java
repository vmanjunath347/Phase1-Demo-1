package com.simplielearn.accessmodifier2;

import com.simplielearn.accessmodifier.PersonData;

public class MainTest extends PersonData {

	public static void main(String[] args) {
		
		//create object
		PersonData personData = new PersonData();
		
		//public method : accessible
		personData.getAge();
		
		

	}

}
