import java.util.Scanner;

public class Program2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n1, n2, add, sub, multi;
		double div;
		
		System.out.println("请输入第一个整数，以回车结束");
		n1 = sc.nextInt();		
		System.out.println("请输入第二个整数，以回车结束");
		n2 = sc.nextInt();
		
		add = n1 + n2;
		sub = n1 - n2;
		multi = n1 * n2;
		div = 0;
		try{
			
			div = (double)n1 / (double)n2;
			
		}catch(Exception e){
			System.out.println(" 除数为0 ");
		}
		
		System.out.println("输入的数为 "+ n1 + " "+ n2 + " " + "和为：" + add + " " + "差为：" + sub + " " + "积为：" + multi + " " + "商为:" + div);
	}

}
