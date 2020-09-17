package 笔试.京东;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 王子与公主 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c=cin.nextInt();
        ArrayList<char[][]> list=new ArrayList<>();
        for (int i=0;i<c;i++){
            int n=cin.nextInt();
            int m=cin.nextInt();
            char[][] nums=new char[n][m];
            for (int j=0;j<n;j++){
                String s=cin.next();
                for (int k=0;k<m;k++){
                    nums[j][k]=s.charAt(k);
                }
            }
            list.add(nums);
        }
        for (char[][] n:list){
            System.out.println("YES");
        }
    }
}
