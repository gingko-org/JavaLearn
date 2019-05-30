package EX529;

import java.util.Scanner;

public class EX5_29_3 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner input = new	Scanner(System.in);
		
		int x,y;
		
		System.out.println("输入商品类型: ");
		x = input.nextInt();
		System.out.println("输入商品数量: ");
		y = input.nextInt();
		
		System.out.println("工资为： "+sum(x,y));
	}
	
	public static double sum(int x,int y){
		final double BASE = 200;
		final double RATE = 0.09;
		double total = 0;
		double sum = 0;
		switch(x){
		case 1 :
			total += 239.99 * y;
		case 2 :
			total += 129.75 * y;
		case 3:
			total += 99.95 * y;
		case 4:
			total += 350.89 * y;
		default:
			break;
		}
		sum = BASE + total * RATE;
		return sum;
	}
}
