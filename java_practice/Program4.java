import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.println("�������һ������n1���Իس�����");
		n1 = sc.nextInt();
		System.out.println("������ڶ�������n2���Իس�����");
		n2 = sc.nextInt();
		System.out.println("���������������n3���Իس�����");
		n3 = sc.nextInt();
		
		int add,ava,mul,max,min;
		
		add = n1 + n2 + n3;
		ava = add / 3;
		mul = n1 * n2 * n3;
		
		max = ((max = (n1 > n2) ? n1 : n2) > n3 ? max : n3);
		min = ((min = (n1 < n2) ? n1 : n3) < n3 ? min : n3);
		
		System.out.println("�������Ϊ "+ n1 + " "+ n2 + " " + n3 + " " + "��Ϊ��" + add 
				+ " " + "ƽ����Ϊ��" + ava + " " + "��Ϊ��" + mul + " " + "�����Ϊ: " + max + " " + "��С��Ϊ��" + min);
	}

}
