package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class 走迷宫 {
    public static void main(String[] args) {
        char[][] nums=new char[][]{{'E','.','.'},
                                    {'#','.','#'},
                                    {'#','.','S'}} ;
        if (dfs(nums,0,0)){
            System.out.println("TRUE");
        }else {
            System.out.println("NO");
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
            nums[i][j]='#';
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
    boolean b=false;
    public  static  boolean dfs(char[][] nums ,int i,int j){

        if (nums[i][j]=='S') return true;

        nums[i][j]='#';
//            for(int k=0;k<4;k++){
//                int x=i;
//                int y=j;
//                if (x+)
//            }
            //上
            if (i-1>=0&&nums[i-1][j]!='#') dfs(nums ,i-1,j);
            //下
            if (i+1<nums.length&&nums[i+1][j]!='#') dfs(nums ,i+1,j);
            //左
            if (j-1>=0&&nums[i][j-1]!='#') dfs(nums ,i,-1);
            //右
            if (j+1<nums.length&&nums[i][j+1]!='#') dfs(nums ,i,j+1);

       
    }
}
