package org.drg.hellomiddleearth;

public class HelloMiddleEarth {

	public static void main(String[] args) {

		String[] names = {"Bilbo","Frodo","Aragon","Legolas","Gandalf","lola"};
		
		//print Greetings to the fine folks in Middle Earth
		for(String name : names){
			System.out.format("Hello, %s!\n", name);
		}
	}

}
