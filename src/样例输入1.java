import java.util.Scanner;

/*
样例题目及程序
A + B
描述 给予两个整数 a 和 b ，计算它们的和 a + b
输入 输入包含多组测试数据，每一行包含两个整数 a 和 b
输出 在一行中输出 a + b 的值
 */
/*
样例输入
5
1,2,5
 */
/*
样例输出
125
 */
public class 样例输入1 {

        public static void main(String args[])
        {
            Scanner cin = new Scanner(System.in);
            int n=cin.nextInt();
            cin.nextLine();
            String s=cin.nextLine();
            String[] string=s.split(",");
            int[] nums=new int[string.length];
            for (int i=0;i<string.length;i++){
                nums[i]=Integer.parseInt(string[i]);
                System.out.print(nums[i]);
            }
//            int a, b;
//            while(cin.hasNextInt())
//            {
//                a = cin.nextInt();
//                b = cin.nextInt();
//                System.out.println(a + b);
//            }
         }
}