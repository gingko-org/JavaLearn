package chapter02;

import java.util.Scanner;

public class Exer2_27 {
    public static void main(String[] args) {
        // 编写一个应用程序，他读取一个整数，并判断他是奇数还是偶数，然后打印该数。提示：可以使用取模运算符。偶数是2的倍数，所有是2的倍数的数，被2除时余数为0.
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.print("请输入一个整数：");
        num = scanner.nextInt();

        // 判断奇偶性
        if(num % 2 == 0) {
            System.out.println(num + "是偶数。");
        } else {
            System.out.println(num + "是奇数。");
        }

        scanner.close();
    }
}
