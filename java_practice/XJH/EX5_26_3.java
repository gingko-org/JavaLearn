package XJH;

import java.util.Scanner;

public class EX5_26_3 {
	
	public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter an integer: ");
        x = input.nextInt();

        System.out.printf("%d ÊÇ %s\n", x, (x % 2 == 0 ? "Å¼Êý": "ÆæÊý"));
    }
}
