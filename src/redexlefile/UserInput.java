package redexlefile;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String name;
		
		System.out.println("Please Enter your name====>");
	    name=input.nextLine();

		System.out.println("Welcome  "+ name);
		
	}

}
