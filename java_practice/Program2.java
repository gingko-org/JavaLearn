import java.util.Scanner;

public class Program2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int n1, n2, add, sub, multi;
		double div;
		
		System.out.println("�������һ���������Իس�����");
		n1 = sc.nextInt();		
		System.out.println("������ڶ����������Իس�����");
		n2 = sc.nextInt();
		
		add = n1 + n2;
		sub = n1 - n2;
		multi = n1 * n2;
		div = 0;
		try{
			
			div = (double)n1 / (double)n2;
			
		}catch(Exception e){
			System.out.println(" ����Ϊ0 ");
		}
		
		System.out.println("�������Ϊ "+ n1 + " "+ n2 + " " + "��Ϊ��" + add + " " + "��Ϊ��" + sub + " " + "��Ϊ��" + multi + " " + "��Ϊ:" + div);
	}

}
