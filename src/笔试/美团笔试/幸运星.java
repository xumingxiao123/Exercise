package 笔试.美团笔试;

import java.util.Scanner;

/*
在观星的时候，一种常用的方式是划出类似于正方形的区域内，确定其中所有星星的坐标。
现在我们在星空（一个无限大的二维平面）上建立坐标系。由于星星很小，我们忽略它的面积，认为每一个星星是一个点，且所有星星的坐标都是整数。
幸运星的定义是这一颗星星在这个平面内，正上，正下，正左，正右都有其他的星星(不一定相邻)。
现在，我们已经将这个正方形的区域取出，并且将他们所在的坐标给你。现在希望你能计算，这个平面内有多少颗幸运星？
样例输入
8
0 0
0 1
0 2
0 3
1 1
1 2
-1 1
-1 2
样例输出
2
提示
样例解释：
有两颗幸运星，分别是(0,1)(0,2)
* */
public class 幸运星 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //HashMap<Integer,Integer> map=new HashMap<>();
        int[][] xy=new int[2][n];

        for(int i=0;i<n;i++){
            int m1 = sc.nextInt();
            int m2= sc.nextInt();
        }

    }
}
