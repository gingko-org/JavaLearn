package chapter02;

import java.util.Scanner;

public class Exer2_17 {
    public static void main(String[] args) {
        // 编写一个应用程序，要求用户输入两个整数，获取用户输入的数据，并在命令行中显示较大的数和“is larger”字样。如果两个数相等，则打印消息“These numbers are equal”
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " is larger");
        } else if(num1 < num2) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }

        scanner.close();
    }
}
