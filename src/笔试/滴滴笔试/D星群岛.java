package 笔试.滴滴笔试;

import sun.rmi.log.LogInputStream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D星群岛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] nums=new int[m][3];
        for (int i=0;i<m;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            nums[i][2]=sc.nextInt();
        }
        int s=sc.nextInt();
        int e=sc.nextInt();
        String string=sc.next();
        int[][] arr=new int[n+1][n+1];
        for (int i=0;i<m;i++){
           // for (int j=0;j<n;j++){
                arr[nums[i][0]][nums[i][1]]=nums[i][2];
            //}
        }
//        System.out.print(Arrays.toString(arr[1]));
//        System.out.print(Arrays.toString(arr[2]));
//        System.out.print(Arrays.toString(arr[3]));
//        System.out.print(Arrays.toString(arr[4]));
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
         for (int i=1;i<n+1;i++){
             //ArrayList<Integer>
             if (arr[s][i]!=0)  {
                 list.add(arr[s][i]);
             }
         }
    }
}
