import java.util.Scanner;

public class Exer4_29 {
    public static void main(String[] args) {
        // 编写一个应用程序，读取用户在输入对话框中输入的三个非零值，判断它们是否可以作为三角形的三条边，如果可以，则打印这个三个数。
        Scanner scanner = new Scanner(System.in);

        int l1, l2, l3;

        System.out.println("请输入三个数，作为三角形的三条边：");

        System.out.print("第一个数：");
        l1 = scanner.nextInt();

        System.out.print("第二个数：");
        l2 = scanner.nextInt();

        System.out.print("第三个数：");
        l3 = scanner.nextInt();

        if((l1 + l2 <= l3) || (l2 + l3 <= l1) || (l1 + l3 <= l2)) {
            System.out.println(l1 + "、" + l2 + "和" + l3 + "不能构成三角形！");
        } else {
            System.out.println(l1 + "、" + l2 + "和" + l3 + "可以构成三角形！");
        }

        scanner.close();
    }
}
