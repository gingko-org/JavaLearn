package EX525;
import java.util.Scanner;

public class Program5 {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int r,diameter;
		double perimeter,area;
		System.out.println("������Բ�İ뾶���Իس�����");
		r = sc.nextInt();
		
		diameter = r * 2;
		perimeter = Math.PI * r * 2;
		area = Math.PI * r * r;
		
		System.out.println("�����Բ�İ뾶Ϊ��" + r + " " + "ֱ��Ϊ�� " + diameter + " " 
		+ "�ܳ�Ϊ��" + perimeter + " " + " ���Ϊ��" + area);
	}
}
