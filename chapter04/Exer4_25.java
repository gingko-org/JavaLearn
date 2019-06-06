import java.util.Scanner;

public class Exer4_25 {
    public static void main(String[] args) {
        // 编写一个应用程序，读入一个只包含0和1的整数（即二进制整数），然后打印出对等的十进制数值。（提示：要求模和除法运算符，每次从右到左摘掉二进制数中的一位数。在十进制数系统中，每个数最右边的一位数值是1，次右边的那一位数值是10，然后是100,1000等等。如十进制数234可以解释成41+310+2100。在二进制数系统中，最右边一位数的数值是1，次右边的位值是2，然后是4,8等等。二进制1101对应的十进制数值为：11+0 * 2+14+18=13。）
        Scanner scanner = new Scanner(System.in);

        double num_bin = 0.0, counter = 0.0, num_dec = 0.0;

        System.out.print("请输入一个二进制数（只包含0和1）：");

        num_bin = scanner.nextDouble();

        while(num_bin != 0) {
            num_dec += ((num_bin % 10) * Math.pow(Double.parseDouble("2"), counter));
            num_bin = Double.parseDouble(String.valueOf((int)num_bin / 10));
            counter++;
        }

        System.out.println("转化为十进制数为" + num_dec);
    }
}
