package 数据结构与算法.其他.赛码网.测试;

import java.util.*;

/*
样例题目及程序
A + B
描述 给予两个整数 a 和 b ，计算它们的和 a + b
输入 输入包含多组测试数据，每一行包含两个整数 a 和 b
输出 在一行中输出 a + b 的值
 */
/*
样例输入
1 2
3 4
5 6
 */
/*
样例输出
3
7
11
 */
public class 样例输入1 {

        public static void main(String args[])
        {
            Scanner cin = new Scanner(System.in);
            int a, b;
            while(cin.hasNextInt())
            {
                a = cin.nextInt();
                b = cin.nextInt();
                System.out.println(a + b);
            }
         }
}