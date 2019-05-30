package EX526;

import java.util.Scanner;

public class EX5_26_2 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        System.out.print("输入5个整数，以空格为间隔: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        // calculate highest
        System.out.printf("Highest: %d\n",
                Math.max(a, Math.max(b, (Math.max(c, Math.max(d, e))))));

        // calculate lowest
        System.out.printf("Lowest: %d\n",
                Math.min(a, Math.min(b, (Math.min(c, Math.min(d, e))))));
    }
}

