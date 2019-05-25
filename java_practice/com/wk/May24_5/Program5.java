package com.wk.May24_5;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/5/25.
 */
public class Program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("请输入圆的半径：");
        r = sc.nextDouble();

        System.out.println("圆的直径是：" + (2*r) + "\n" + "圆的周长是：" + (2*r*Math.PI) + "\n" +"圆的面积是：" + (r*r*Math.PI));
    }
}
