package EX529;

import java.util.Scanner;

public class EX5_29_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new	Scanner(System.in);
		
		String first_name,last_name;
		System.out.println("Enter last name:");
		last_name = input.next();
		System.out.println("Enter first name:");
		first_name = input.next();
		
		System.out.println("name is:" +last_name + " " + first_name);
	}

}
