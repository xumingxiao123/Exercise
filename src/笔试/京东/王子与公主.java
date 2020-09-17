package 笔试.京东;

import java.lang.reflect.Array;
import java.util.*;

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
            for (int i=0;i<n.length;i++){
                for (int j=0;j<n[0].length;j++){
                       if (n[i][j]=='E'){
                           if(helper(n,i,j)){
                               System.out.println("YES");
                           }else{
                               System.out.println("NO");
                           }
                       }
                }
            }
        }
    }
    public  static  boolean helper(char[][] nums ,int i,int j){
        int m=nums.length;
        int n=nums[0].length;
        int[] start=new int[2];
        start[0]=i;
        start[1]=j;
        Queue<int[]> q=new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            i=q.peek()[0];
            j=q.peek()[1];
            q.poll();
            if (nums[i][j]=='S') return true;
//            for(int k=0;k<4;k++){
//                int x=i;
//                int y=j;
//                if (x+)
//            }
            //上
            if (i-1>=0&&nums[i-1][j]!='#') q.add(new int[]{i-1,j});
            //下
            if (i+1<m&&nums[i+1][j]!='#') q.add(new int[]{i+1,j});
            //左
            if (j-1>=0&&nums[i][j-1]!='#') q.add(new int[]{i,j-1});
            //右
            if (j+1<m&&nums[i][j+1]!='#') q.add(new int[]{i,j+1});
        }
        return  false;
    }
}
