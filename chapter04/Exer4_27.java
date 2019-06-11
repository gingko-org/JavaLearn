package chapter04;

public class Exer4_27 {
    public static void main(String[] args) {
        // 编写一个应用程序，在命令窗口连续显示2的幂值，即2、4、8、16、32等等。程序必须能不断循环下去（即创建一个无线循环）
        int num = 2;

        while (true) {
            System.out.println(num);
            num *= 2;
        }
    }
}
