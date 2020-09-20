package 笔试.度小满;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 坚强的小昆虫 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int nn=cin.nextInt();
        ArrayList<char[][]> list=new ArrayList<>();
        for (int i=0;i<nn;i++){
            int m=cin.nextInt();
            int n=cin.nextInt();
            char[][] chars=new char[m][n];
            for (int j=0;j<m;j++){
                String s=cin.next();
                for (int k=0;k<s.length();k++){
                    chars[j][k]=s.charAt(k);
                }
            }
            list.add(chars);
        }
        ArrayList<Integer> list2=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            char[][] chars=list.get(i);
            for (int j=0;j<chars.length;j++){
                for (int k=0;k<chars[0].length;k++){
                   if (chars[j][k]=='@'){
                       dfs(chars,j,k);
                   }
                }
            }
        }

        for (int i=0;i<list2.size();i++){
            System.out.println(list.get(i));
        }

    }

    private static void dfs(char[][] chars, int j, int k) {

    }
    static  boolean b=false;
    public  static  void dfs1(char[][] nums ,int i,int j){

        if (i<0||i>=nums.length||j<0||j>=nums[0].length) {
            b=true;
            return;
        }
        nums[i][j]='#';
//            for(int k=0;k<4;k++){
//                int x=i;
//                int y=j;
//                if (x+)
//            }
        //上
        dfs(nums ,i-1,j);
        //下
         dfs(nums ,i+1,j);
        //左
         dfs(nums ,i,-1);
        //右
         dfs(nums ,i,j+1);

         return;

    }
}
