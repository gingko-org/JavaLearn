package chapter02;

import java.util.Scanner;

public class Exer2_18 {
    public static void main(String[] args) {
        // 编写一个应用程序，要求用户输入3个整数，并在命令行中显示这些数的和、平均数、积、最小数和最大数。注意：本练习中平均数计算应当产生整数结果。因此，如果3个值的总和为7，则平均数应该为2，而不是2.3333......

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();

        System.out.print("请输入第三个整数：");
        int num3 = scanner.nextInt();

        System.out.println(num1 + "、" + num2 + "、" + num3 + "的和为：" + (num1 + num2 + num3));
        System.out.println(num1 + "、" + num2 + "、" + num3 + "的积为：" + (num1 * num2 * num3));

        int max = num1;
        int min = num1;

        if(max < num2) {
            max = num2;
        } else if(max < num3) {
            max = num3;
        }

        if(min > num2) {
            min = num2;
        } else if(min > num3) {
            min = num3;
        }

        System.out.println(num1 + "、" + num2 + "、" + num3 + "的最小值为：" + min);
        System.out.println(num1 + "、" + num2 + "、" + num3 + "的最大值为：" + max);

        scanner.close();
    }
}
