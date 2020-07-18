package 数据结构与算法.其他.赛码网.数据结构2;

//链接：https://exercise.acmcoder.com/online/online_judge_ques?ques_id=3374&konwledgeId=41
//给你两个集合，要求 {A} + {B}。
/*
样例输入
1 2
1
2 3
1 2
1
1 2
样例输出
1 2 3
1 2
* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class 集合 {

    public static void main(String[] args) {
        //写样例输入
        Scanner in = new Scanner(System.in);
        //有值则继续循环
        while(in.hasNext()){
/*
next()、nextLine()、nextInt()是scanner内置的方法。
使用nextLine()方法时，不将空格看做是两个字符串的间隔，而是看作字符串的一部分，返回时，它作为String类型一并返回
使用next()方法时，将空格看作是两个字符串的间隔
使用nextInt()方法时，与next()方法类似，只是它的返回值是int类型的，依旧将空格看作是两个输入的数据的间隔
（当使用nexInt()方法时，只能输入int类型的数据。）
* */
            int n = in.nextInt();
            int m = in.nextInt();
            //用hashset存储值
            HashSet<Integer> hashset = new HashSet<Integer>();
            for(int i = 0; i < n; i++){
                hashset.add(in.nextInt());
            }
            for(int i = 0; i < m; i++){
                hashset.add(in.nextInt());
            }
            Object[] arr = hashset.toArray();
            int[] array = new int[arr.length];
            for(int i = 0; i < array.length; i++){
                array[i] = (int) arr[i];
            }
            Arrays.sort(array);
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]+" ");
            }
        }


    }
}