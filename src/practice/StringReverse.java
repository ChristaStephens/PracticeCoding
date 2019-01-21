package practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// Reversing a string from a user input.
		
		System.out.println("Hey user, input a string:");
		Scanner read = new Scanner (System.in);
		String str = read.nextLine();
		String reverse ="";
		
		for (int i =str.length()-1; i>0;i--) {
			
			reverse = reverse + str.charAt(i);
		}
		System.out.println("reversed string is "+ reverse);

	}

}
