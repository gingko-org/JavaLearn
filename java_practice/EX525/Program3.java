package EX525;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		System.out.println("�������һ������n1���Իس�����");
		n1 = sc.nextInt();
		System.out.println("������ڶ�������n2���Իس�����");
		n2 = sc.nextInt();
		
		if(n1 > n2){
			System.out.println("n1 is larger, n1 is : " + n1);
		}else if(n1 < n2){
			System.out.println("n2 is larger, n2 is : " + n2);
		}else{
			System.out.println("The numbers are equal");
		}
	}

}
