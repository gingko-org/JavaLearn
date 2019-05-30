package chapter02;

import java.util.Scanner;

public class Exer2_28 {
    public static void main(String[] args) {
        // 编写一个应用程序，它读取两个整数，判定第一个数是不是第二个数的倍数，并打印结果。提示：使用取模运算符。
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        System.out.print("请输入第1个整数：");
        num1 = scanner.nextInt();

        System.out.print("请输入第2个整数：");
        num2 = scanner.nextInt();

        if(num1 % num2 == 0) {
            System.out.println(num1 + "是" + num2 + "的倍数。");
        } else {
            System.out.println(num1 + "不是" + num2 + "的倍数。");
        }

        scanner.close();
    }
}
