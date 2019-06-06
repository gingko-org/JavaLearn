import java.util.Scanner;

public class Exer4_24 {
    public static void main(String[] args) {
        // 回文是一种从前向后和从后向前读起来都相同的字符序列。例如下面的各个5位整数：12321、55555、45554以及11611都是回文。编写一个JAVA应用程序，读入一个5位整数并判断它是否是回文
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个五位数：");

        num = scanner.nextInt();

        int num2 = (num / 10000) % 10 * 1 + (num / 1000) % 10 * 10 + (num / 100) % 10 * 100 + (num / 10) % 10 * 1000 + (num - num / 10 * 10) * 10000;

        if(num == num2) {
            System.out.println(num + "是回文数！");
        } else {
            System.out.println(num + "不是回文数！");
        }
    }
}
