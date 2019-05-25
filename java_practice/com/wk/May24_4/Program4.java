package com.wk.May24_4;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/5/25.
 */
public class Program4 {
    public static void main(String[] args){
        int first, second,third;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer：");
        first = sc.nextInt();
        System.out.println("Please enter the second integer：");
        second = sc.nextInt();
        System.out.println("Please enter the third integer：");
        third = sc.nextInt();

        int add, ave, mul, max, min;
        add = first + second + third;
        ave = add / 3;
        mul = first * second * third;
        max = ((max = (first > second) ? first : second) > third ? max : third);
        min = ((min = (first < second) ? first : third) < third ? min : third);

        System.out.println("和为：" + add);
        System.out.println("平均数为：" + ave);
        System.out.println("积为：" + mul);
        System.out.println("最大数为：" + max);
        System.out.println("最小数为：" + min);
    }
}
