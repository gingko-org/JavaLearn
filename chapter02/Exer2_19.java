package chapter02;

import java.util.Scanner;

public class Exer2_19 {
    public static void main(String[] args) {
        // 编写一个应用程序，要求用户以整数形式输入一个圆的半径，并打印圆的直径、周长和面积。π取值3.14159.注意：π也可以用预定义的常量Math.PI，该常量币3.14159更加精确。Math类在java.lang包中定义。因此你不需要导入它。使用如下公式（r为半径）：直径=2r，周长=2πr，面积=πr*r。不要将每次计算结果存储到变量中，而是将结果直接加入一个用于显示结果的字符串。
        Scanner scanner = new Scanner(System.in);

        // π取值3.14159
        System.out.print("请输入圆的半径：");
        double r = scanner.nextDouble();

        System.out.println("圆的直径：" + (2 * r));
        System.out.println("圆的周长：" + (2 * 3.14159 * r));
        System.out.println("圆的面积：" + (3.14159 * r * r));

        // π取值Math.PI
        double pi = Math.PI;

        System.out.println("圆的直径：" + (2 * r));
        System.out.println("圆的周长：" + (2 * pi * r));
        System.out.println("圆的面积：" + (pi * r * r));
    }
}
