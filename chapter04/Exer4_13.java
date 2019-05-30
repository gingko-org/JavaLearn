import java.util.Scanner;

public class Exer4_13 {
    public static void main(String[] args) {
        // 一家大公司对售货员按任务提成发放工资。每个售货员的基本工资是每周$200,另加提成为本周个人总零售额的9%。例如，某个售货员在一周内推销了总额为$5000的商品，那他在这一周内的工资为基本工资$200加上$5000乘以9%，即$650。公司提供了上周每个售货员的销售清单，各种商品的价格如下:
        /*
            商品  价格
            1     233.99
            2     129.75
            3     99.95
            4     350.89
        */
        // 编写一个程序，输入一个售货员上周推销的商品类型和数量，然后计算并显示这个销售员的收入。如销售员所推销的商品数量没有限制。

        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
        double sum = 200;

        System.out.print("请输入商品1的销售数量：");
        num1 = scanner.nextInt();

        System.out.print("请输入商品2的销售数量：");
        num2 = scanner.nextInt();

        System.out.print("请输入商品3的销售数量：");
        num3 = scanner.nextInt();

        System.out.print("请输入商品4的销售数量：");
        num4 = scanner.nextInt();

        sum += (233.99 * (double)num1 + 129.75 * (double)num2 + 99.95 * (double)num3 + 350.89 * (double)num4);

        System.out.println("该销售员本周的总工资为：" + sum);

        scanner.close();
    }
}
