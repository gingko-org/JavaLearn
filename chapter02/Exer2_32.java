public class Exer2_32 {
    public static void main(String[] args) {
        // 编写0到10的平方和立方，并按照下面方式输出。
        /*
        number  square  cube
        0       0       0
        1       1       1
        */

        System.out.println("number\tsquare\tcube");

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t" + (i * i) + "\t\t" + (i * i * i));
        }
    }
}
