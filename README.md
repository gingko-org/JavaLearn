练习题目列表
============

## 2019.05.25
1. （2.15）编写一个程序，在同一行上显示数字1到4，相邻的数字用一个空格分开。按照如下要求编写程序：
    a)使用1个System.out语句。
    b)使用4个System.out语句。
2. （2.16）编写一个应用程序，要求用户输入两个整数，获取用户所输入的数据，然后打印这两个数的和、差、积和商（除法）。
3. （2.17）编写一个应用程序，要求用户输入两个整数，获取用户输入的数据，并在命令行中显示较大的数和“is larger”字样。如果两个数相等，则打印消息“These numbers are equal”。
4. （2.18）编写一个应用程序，要求用户输入3个整数，并在命令行中显示这些书的和、平均数、积、最小数和最大数。注意：本练习中平均数计算应当产生整数结果。因此，如果3个值的总和为7，则平均数应该为2，而不是2.3333......。
5. （2.19）编写一个应用程序，要求用户以整数形式输入一个圆的半径，并打印圆的直径、周长和面积。π取值3.14159.注意：π也可以用预定义的常量Math.PI，该常量币3.14159更加精确。Math类在java.lang包中定义。因此你不需要导入它。使用如下公式（r为半径）：直径=2r，周长=2πr，面积=πr*r。不要将每次计算结果存储到变量中，而是将结果直接加入一个用于显示结果的字符串。

## 2019.05.26
1. （2.20）编写应用程序，在命令行窗口显示用星号（*）组成的举行、椭圆、箭头和菱形。
    ```
    *********            ***              *               *
    *       *          *     *           ***             * *
    *       *         *       *         *****           *   *
    *       *         *       *           *            *     *
    *       *         *       *           *           *       *
    *       *         *       *           *            *     *
    *       *         *       *           *             *   *
    *       *          *     *            *              * *
    *********            ***              *               *
    ```

2. （2.26）编写一个应用程序，它读取5个整数，然后确定和打印其中的最大数和最小数。
3. （2.27）编写一个应用程序，他读取一个整数，并判断他是奇数还是偶数，然后打印该数。提示：可以使用取模运算符。偶数是2的倍数，所有是2的倍数的数，被2除时余数为0.
4. （2.28）编写一个应用程序，它读取两个整数，判定第一个数是不是第二个数的倍数，并打印结果。提示：使用取模运算符。
5. （2.29）编写一个在命令窗口中显示如下棋盘形图案的应用程序。
    ```
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    * * * * * * * *
     * * * * * * * *
    ```
    
## 2019.05.29
1. （2.32）编写0到10的平方和立方，并按照下面方式输出。
    ```
        number  square  cube
        0       0       0
        1       1       1
    ```
2. （2.33）编写一个程序，通过两次输入，读取用户的名和姓，然后连接名和姓，之间加一个空格，最后再一个命令行中显示经过连接的字符串。
3. （4.13）一家大公司对售货员按任务提成发放工资。每个售货员的基本工资是每周$200,另加提成为本周个人总零售额的9%。例如，某个售货员在一周内推销了总额为$5000的商品，那他在这一周内的工资为基本工资$200加上$5000乘以9%，即$650。公司提供了上周每个售货员的销售清单，各种商品的价格如下:
    ```
        商品  价格
        1     233.99
        2     129.75
        3     99.95
        4     350.89
    ```
    编写一个程序，输入一个售货员上周推销的商品类型和数量，然后计算并显示这个销售员的收入。如销售员所推销的商品数量没有限制。
4. （4.14）编写一个程序，确定公司里三名员工每个人的总收入。公司对每位员工前40小时的工作按正规工作时间计算报酬，超出40小时以外的每小时工作按基本工资1.5倍的加班费计算报酬。公司提供了一张清单，上面有公司员工姓名、每位员工上周工作的小时数和每位员工每小时的基本工资。要求程序输入每位员工的信息，计算并显示每位员工的总收入。
5. （4.15）在计算机应用程序中，经常要遇到查找最大值的过程(即找出一组数值中的最大值)。例如，在一个用于确定销售竞赛冠军的程序中，需要输入每个销售员销售的商品数，其中销售商品数最多的那个销售员将赢得竞赛冠军。编写一个程序，以字符形式输入10个数字，然后找出并打印其中最大的数。程序应该至少使用以下三个变量: 
    ```
        a) counter: 累计到10的计数器( 记录输入了多少数，判断何时处理完10个数)；
        b) number: 当前输入的数；
        c) largest: 迄今为止所找到的最大值。
    ```
    
## 2019.05.30
1. (4.16)编写一个Java应用程序，用循环结构打印如下的数值列表：
    ```
        N      10*N     100*N     1000*N
        1       10       100       1000
        2       20       200       2000
        3       30       300       3000
        4       40       400       4000
        5       50       500       5000
    ```
2. (4.24)回文是一种从前向后和从后向前读起来都相同的字符序列。例如下面的各个5位整数：12321、55555、45554以及11611都是回文。编写一个JAVA应用程序，读入一个5位整数并判断它是否是回文。

3. (4.25)编写一个应用程序，读入一个只包含0和1的整数（即二进制整数），然后打印出对等的十进制数值。（提示：要求模和除法运算符，每次从右到左摘掉二进制数中的一位数。在十进制数系统中，每个数最右边的一位数值是1，次右边的那一位数值是10，然后是100,1000等等。如十进制数234可以解释成4*1+3*10+2*100。在二进制数系统中，最右边一位数的数值是1，次右边的位值是2，然后是4,8等等。二进制1101对应的十进制数值为：1*1+0 * 2+1*4+1*8=13。）

4. (4.27)编写一个应用程序，在命令窗口连续显示2的幂值，即2、4、8、16、32等等。程序必须能不断循环下去（即创建一个无线循环）。

5. (4.29)编写一个应用程序，读取用户在命令行中输入的三个非零值，判断它们是否可以作为三角形的三条边，如果可以，则打印这个三个数。

## 2019.05.31
1. (4.30)编写一个程序，读取用户在命令行中输入的三个非零数值，判断它们是否可以作为直角三角形的三条边，如果可以，则打印这三个数。
2. (4.31)一家公司想要通过电话传送数据，但是担心电话会被窃听。现在要求程序员编写一个应用程序，对数据进行加密，以使数据传送更安全。已知所有要传送的数据都是4位整数。要求程序从命令行中读入用户输入的4位整数，然后采用如下方法进行加密：对每一位数加7，然后用得到的新值对10求模；接着对求模得到的数值按照第一位与第三位、第二位与第四位互换位置的方式排列；然后打印加密后的整数。重新编写一个应用程序，将加密后的4位数解密成原来的数字。
3. (4.32)非负整数的阶乘记作n!（读为“n的阶乘”），定义为：
    ```
        n!=n*(n-1)*(n-2)* ... *2*1(n≥1)以及n!=1(n=0)。例如：5!=5*4*3*2*1=120
    ```
    a) 编写一个应用程序，从命令行读入一个非负整数，计算并打印它的阶乘；
    b) 编写一个应用程序，用下面的公式估算数学常数e的值：
    ```
        e=1+(1/1!)+(1/2!)+(1/3!)+...
    ```
    c) 编写一个应用程序，用下面的公式计算数学常数e的x次幂：
    ```
        e^x=1+(x/1!)+(x^2/2!)+(x^3/3!)+...
    ```
4. (5.6)编写应用程序，找出几个整数中的最小值。假定读入的第一个数值表示用户要输入的数值个数。
5. (5.7)编写应用程序，计算1到15之间所有奇数之积，并在命令行中显示结果。
