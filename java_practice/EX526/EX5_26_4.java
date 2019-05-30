package EX526;

import java.util.Scanner;

public class EX5_26_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

        System.out.print("输入2个整数，以空格为间隔: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.printf("%d is%sa multiple of %d\n", x, (x % y == 0 ? " " : " not "), y);
	}

}
