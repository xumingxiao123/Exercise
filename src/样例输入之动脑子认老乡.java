package 面试;

import java.util.*;

//https://exercise.acmcoder.com/online/online_judge_ques?ques_id=9579&konwledgeId=137&opencustomeinput=true
// 写代码时不要带中文注释
// 不要自定义包名称，否则会报错，即不要添加package answer之类的语句；
// 您可以写很多个类，但是必须有一个类名为Main，并且为public属性，并且Main为唯一的public class，
// Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
/*
输入样例：
3 1
2 3 1
5 4
1 2 1
3 4 0
2 5 1
3 2 1
* */
public class 样例输入之动脑子认老乡 {

        public static void main(String args[])
        {
            Scanner cin = new Scanner(System.in);
            int N, M;
            // 读取输入，直到没有整型数据可读
            while(cin.hasNextInt())
            {
                // 读取N 和 M
                N = cin.nextInt();
                M = cin.nextInt();
                System.out.println(String.format("%d %d", N, M));
                // 读取接下来M行
                for (int i=0; i<M; i++) {
                    // 读取每行的a b c
                    int a = cin.nextInt(),
                            b = cin.nextInt(),
                            c = cin.nextInt();
                    System.out.println(String.format("%d %d %d", a, b, c));
                }
            }
        }
}
