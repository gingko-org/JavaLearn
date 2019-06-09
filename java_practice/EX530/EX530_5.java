package EX530;

import java.util.Scanner;

public class EX530_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        System.out.print("输入第一条边: ");
        int a = sc.nextInt();

        System.out.print("输入第二条边: ");
        int b = sc.nextInt();

        System.out.print("输入第三条边: ");
        int c = sc.nextInt();

        System.out.printf("The entered values could%sbe a triangle\n",
            isTriangle(a, b, c) ? " " : " NOT ");
    }
    // use triangle inequality theorem to determine viability
    // the sum of any 2 sides must be greater than the 3rd
    // must be true of all combinations
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
	

}
