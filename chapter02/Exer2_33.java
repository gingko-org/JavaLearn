import java.util.Scanner;

public class Exer2_33 {
    public static void main(String[] args) {
        // 编写一个程序，通过两次输入，读取用户的名和姓，然后连接名和姓，之间加一个空格，最后再一个消息对话框中显示经过连接的字符串。
        Scanner scanner = new Scanner(System.in);

        String first_name = "", last_name = "";

        System.out.print("请输入姓：");
        first_name = scanner.next();

        System.out.print("请输入名：");
        last_name = scanner.next();

        System.out.println(first_name + " " + last_name);

        scanner.close();
    }
}
