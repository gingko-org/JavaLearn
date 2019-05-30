package EX525;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int r,diameter;
		double perimeter,area;
		System.out.println("请输入圆的半径，以回车结束");
		r = sc.nextInt();
		
		diameter = r * 2;
		perimeter = Math.PI * r * 2;
		area = Math.PI * r * r;
		
		System.out.println("输入的圆的半径为：" + r + " " + "直径为： " + diameter + " " 
		+ "周长为：" + perimeter + " " + " 面积为：" + area);
	}
}
