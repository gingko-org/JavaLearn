package chapter02;

import java.util.Scanner;

public class Exer2_16 {
    public static void main(String[] args) {
        // 编写一个应用程序，要求用户输入两个整数，获取用户所输入的数据，然后打印这两个数的和、差、积和商（除法）

        // 要求用户输入两个整数
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        Integer num1 = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        Integer num2 = scanner.nextInt();

        // 打印输入的两个数的和、差、积和商
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
