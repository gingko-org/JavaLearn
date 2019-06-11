package chapter04;

import java.util.Scanner;

public class Exer4_30 {
    public static void main(String[] args) {
        // 编写一个程序，读取用户在命令行中输入的三个非零数值，判断它们是否可以作为直角三角形的三条边，如果可以，则打印这三个数。
        Scanner scanner = new Scanner(System.in);

        double num1 = 0.0, num2 = 0.0, num3 = 0.0;

        System.out.print("请输入第一个数：");
        num1 = scanner.nextDouble();

        System.out.print("请输入第二个数：");
        num2 = scanner.nextDouble();

        System.out.print("请输入第三个数：");
        num3 = scanner.nextDouble();

        if((num1 * num1 + num2 * num2 == num3 * num3) || (num2 * num2 + num3 * num3 == num1 * num1) || (num1 * num1 + num3 * num3 == num2 * num2)) {
            System.out.println(num1 + "、" + num2 + "和" + num3 + "可以组成一个直角三角形！");
        }

        scanner.close();
    }
}