import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.println("请输入第一个整数n1，以回车结束");
		n1 = sc.nextInt();
		System.out.println("请输入第二个整数n2，以回车结束");
		n2 = sc.nextInt();
		System.out.println("请输入第三个整数n3，以回车结束");
		n3 = sc.nextInt();
		
		int add,ava,mul,max,min;
		
		add = n1 + n2 + n3;
		ava = add / 3;
		mul = n1 * n2 * n3;
		
		max = ((max = (n1 > n2) ? n1 : n2) > n3 ? max : n3);
		min = ((min = (n1 < n2) ? n1 : n3) < n3 ? min : n3);
		
		System.out.println("输入的数为 "+ n1 + " "+ n2 + " " + n3 + " " + "和为：" + add 
				+ " " + "平均数为：" + ava + " " + "积为：" + mul + " " + "最大数为: " + max + " " + "最小数为：" + min);
	}

}
