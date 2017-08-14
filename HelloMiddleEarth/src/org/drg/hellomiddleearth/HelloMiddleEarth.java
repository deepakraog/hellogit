package org.drg.hellomiddleearth;

public class HelloMiddleEarth {

	public static void main(String[] args) {

		String[] names = {"Bilbo","Frodo","Aragon","Legolas","Gandalf"};
		
		//print Greetings
		for(int i = 0;i<names.length;i++){
			System.out.format("Hello, %s!\n", names[i]);
		}
	}

}
