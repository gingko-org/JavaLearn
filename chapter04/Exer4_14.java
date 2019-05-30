package chapter04;

import java.util.Scanner;

public class Exer4_14 {
    public static void main(String[] args) {
        // 编写一个程序，确定公司里三名员工每个人的总收入。公司对每位员工前40小时的工作按正规工作时间计算报酬，超出40小时以外的每小时工作按基本工资1.5倍的加班费计算报酬。公司提供了一张清单，上面有公司员工姓名、每位员工上周工作的小时数和每位员工每小时的基本工资。要求程序输入每位员工的信息，计算并显示每位员工的总收入。

        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double salary1 = 0, salary2 = 0, salary3 = 0;
        String name1 = "", name2 = "", name3 = "";

        System.out.print("请输入第1位员工的姓名：");
        name1 = scanner.next();
        System.out.print("请输入" + name1 + "上周的工作时长：");
        num1 = scanner.nextInt();
        System.out.print("请输入" + name1 + "的基本时薪：");
        salary1 = scanner.nextInt();

        System.out.print("请输入第2位员工的姓名：");
        name2 = scanner.next();
        System.out.print("请输入" + name2 + "上周的工作时长：");
        num2 = scanner.nextInt();
        System.out.print("请输入" + name2 + "的基本时薪：");
        salary2 = scanner.nextInt();

        System.out.print("请输入第3位员工的姓名：");
        name3 = scanner.next();
        System.out.print("请输入" + name3 + "上周的工作时长：");
        num3 = scanner.nextInt();
        System.out.print("请输入" + name3 + "的基本时薪：");
        salary3 = scanner.nextInt();

        if(num1 <= 40) {
            salary1 = salary1 * 40;
        } else {
            salary1 = salary1 * 40 + (num1 - 40) * salary1 * 1.5;
        }

        if(num2 <= 40) {
            salary2 = salary2 * 40;
        } else {
            salary2 = salary2 * 40 + (num2 - 40) * salary2 * 1.5;
        }

        if(num3 <= 40) {
            salary3 = (salary3 * 40);
        } else {
            salary3 = (salary3 * 40 + (num3 - 40) * salary3 * 1.5);
        }

        System.out.println("员工" + name1 + "的上周工资为：$" + salary1);
        System.out.println("员工" + name1 + "的上周工资为：$" + salary2);
        System.out.println("员工" + name2 + "的上周工资为：$" + salary3);

        scanner.close();
    }
}
