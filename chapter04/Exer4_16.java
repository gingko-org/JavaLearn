package chapter04;

public class Exer4_16 {
    public static void main(String[] args) {
        // 编写一个Java应用程序，用循环结构打印如下的数值列表：
        /*
            N      10*N     100*N     1000*N
            1       10       100       1000
            2       20       200       2000
            3       30       300       3000
            4       40       400       4000
            5       50       500       5000
        */

        int counter;

        System.out.println("N\t10*N\t100*N\t1000*N");

        for(counter = 1; counter <= 9; counter++) {
            System.out.println(counter + "\t" + (10 * counter) + "\t\t" + (100 * counter) + "\t\t" + (1000 * counter));
        }
    }
}
