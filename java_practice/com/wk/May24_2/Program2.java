package com.wk.May24_2;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/5/25.
 */
public class Program2 {
    public static void main(String[] args){
        int first, second, add, sub, mul;
        double div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer：");
        first = sc.nextInt();
        System.out.println("Please enter the second integer：");
        second = sc.nextInt();

        add = first + second;
        sub = first - second;
        mul = first * second;
        div = 0;
        try{
            div = (double) first / (double) second;
        }catch(Exception e){
            System.out.println("难受");
        }

        System.out.println("两个整数分别为："+ first + " "+ second);
        System.out.println("和为：" + add);
        System.out.println("差为：" + sub);
        System.out.println("积为：" + mul);
        System.out.println("商为：" + div);
    }
}
