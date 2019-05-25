package com.wk.May24_3;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/5/25.
 */
public class Program3 {
    public static void main(String[] args){
        int first, second;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer：");
        first = sc.nextInt();
        System.out.println("Please enter the second integer：");
        second = sc.nextInt();

        if(first > second){
            System.out.println("first is larger, first is : " + first);
        }else if(first < second){
            System.out.println("second is larger, second is : " + second);
        }else{
            System.out.println("The numbers are equal");
        }
    }
}
