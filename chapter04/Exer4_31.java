package chapter04;

import java.util.Scanner;

public class Exer4_31 {
    public static void main(String[] args) {
        // 一家公司想要通过电话传送数据，但是担心电话会被窃听。现在要求程序员编写一个应用程序，对数据进行加密，以使数据传送更安全。已知所有要传送的数据都是4位整数。要求程序从命令行中读入用户输入的4位整数，然后采用如下方法进行加密：对每一位数加7，然后用得到的新值对10求模；接着对求模得到的数值按照第一位与第三位、第二位与第四位互换位置的方式排列；然后打印加密后的整数。重新编写一个应用程序，将加密后的4位数解密成原来的数字。
        Scanner scanner = new Scanner(System.in);

        // 加密操作
        int num, num1, num2, num3, num4, temp;

        System.out.print("请输入4位明文：");

        num = scanner.nextInt();

        // 获取输入的每一位数
        num1 = num / 1000 % 10;
        num2 = num / 100 % 10;
        num3 = num / 10 % 10;
        num4 = num % 10;

        // 开始加密
        num1 = (num1 + 7) % 10;
        num2 = (num2 + 7) % 10;
        num3 = (num3 + 7) % 10;
        num4 = (num4 + 7) % 10;

        // 第一位与第三位互换，第二位与第四位互换
        temp = num1;
        num1 = num3;
        num3 = temp;

        temp = num2;
        num2 = num4;
        num4 = temp;

        // 组合成密文
        num = num1 * 1000 + num2 * 100 + num3 * 10 + num4;

        System.out.println("最终加密的结果是：" + num);

        // 解密操作
        int n, n1, n2, n3, n4, t;

        System.out.print("请输入4位密文：");
        n = scanner.nextInt();

        // 获取输入的每一位数
        n1 = n / 1000 % 10;
        n2 = n / 100 % 10;
        n3 = n / 10 % 10;
        n4 = n % 10;

        // 第一位与第三位互换，第二位与第四位互换
        t = n1;
        n1 = n3;
        n3 = t;

        t = n2;
        n2 = n4;
        n4 = t;

        // 解密操作
        n1 = (n1 + 3) % 10;
        n2 = (n2 + 3) % 10;
        n3 = (n3 + 3) % 10;
        n4 = (n4 + 3) % 10;

        // 组合成明文
        n = n1 * 1000 + n2 * 100 + n3 * 10 + n4;

        System.out.println("最终解密的结果是：" + n);

        scanner.close();
    }
}
