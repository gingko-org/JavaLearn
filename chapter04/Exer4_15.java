package chapter04;

import java.util.Scanner;

public class Exer4_15 {
    public static void main(String[] args) {
        // 在计算机应用程序中，经常要遇到查找最大值的过程(即找出一组数值中的最大值)。例如，在一个用于确定销售竞赛冠军的程序中，需要输入每个销售员销售的商品数，其中销售商品数最多的那个销售员将赢得竞赛冠军。编写一个程序，以字符形式输入10个数字，然后找出并打印其中最大的数。程序应该至少使用以下三个变量:
        /*
            a) counter: 累计到10的计数器(记录输入了多少数，判断何时处理完10个数)；
            b) number: 当前输入的数；
            c) largest: 迄今为止所找到的最大值。
        */

        Scanner scanner = new Scanner(System.in);

        int counter, number, largest = 0;

        System.out.println("请输入10个整数，程序将找出其中最大的值。");

        for(counter = 0; counter < 10; counter++) {
            System.out.print("请输入第" + (counter + 1) + "个整数：");
            number = scanner.nextInt();
            if(number > largest) {
                largest = number;
            }
        }

        System.out.println("输入的整数中，最大数为：" + largest);

        scanner.close();
    }
}
