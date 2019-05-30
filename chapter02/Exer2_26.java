package chapter02;

import java.util.Scanner;

public class Exer2_26 {
    public static void main(String[] args) {
        // 编写一个应用程序，它读取5个整数，然后确定和打印其中的最大数和最小数。
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

        System.out.print("请输入第一个整数：");
        num1 = scanner.nextInt();
        System.out.println();

        System.out.print("请输入第二个整数：");
        num2 = scanner.nextInt();
        System.out.println();

        System.out.print("请输入第三个整数：");
        num3 = scanner.nextInt();
        System.out.println();

        System.out.print("请输入第四个整数：");
        num4 = scanner.nextInt();
        System.out.println();

        System.out.print("请输入第五个整数：");
        num5 = scanner.nextInt();
        System.out.println();

        int max = num1, min = num1;

        // 找出最大值
        if(num2 > max) {
            max = num2;
        } else if(num3 > max) {
            max = num3;
        } else if(num4 > max) {
            max = num4;
        } else if(num5 > max) {
            max = num5;
        }

        // 找出最小值
        if(num2 < min) {
            min = num2;
        } else if(num3 < min) {
            min = num3;
        } else if(num4 < min) {
            min = num4;
        } else if(num5 < min) {
            min = num5;
        }

        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + "的最大值是" + max + "，最小值是" + min + "。");
        scanner.close();
    }
}
