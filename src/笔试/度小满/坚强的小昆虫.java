package 笔试.度小满;

import java.util.*;

/**
 *由于新冠肺炎疫情的爆发，小明养在宿舍的小昆虫已经很久很久都没有人管了。小昆虫已经饿的不行了，必须出来找东西吃，可是出来之后需要走出一个迷宫。
 * 小昆虫每次可以朝上、下、左、右四个方向之一走一步，且只要走出任意一条边界线即可逃出迷宫。这只小昆虫曾感染过X星的一种奇异病毒，
 * 目前还没有发现任何副作用，但是却拥有了一项特异功能——破坏障碍物。
 * 假设小昆虫在一个N*M的迷宫中，"@"代表小昆虫的初始位置，"."代表可以通过的空地，"*"代表可以破坏的障碍物，"#"代表不可破坏的障碍物。
 * 请问小昆虫最少需要使用多少次特异功能才可以逃出迷宫？
 * 3
 * 3 3
 * ###
 * #@*
 * ***
 * 3 4
 * ####
 * #@.*
 * **.*
 * 3 3
 * .#.
 * #@#
 * .#.
 */

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
                       list2.add(helper(chars,j,k));
                   }
                }
            }
        }

        for (int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }

    }

    public  static  int  helper(char[][] nums ,int i,int j){
        int m=nums.length;
        int n=nums[0].length;
        int[] start=new int[2];
        start[0]=i;
        start[1]=j;
        Queue<int[]> q=new LinkedList<>();
        Queue<int[]> p=new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            i=q.peek()[0];
            j=q.peek()[1];
            q.poll();

            if (i==0||i==m-1||j==0||j==n-1) return 0;

            if (i-1>=0&&nums[i-1][j]=='*') p.add(new int[]{i-1,j});
            //下
            if (i+1<m&&nums[i+1][j]=='*') p.add(new int[]{i+1,j});
            //左
            if (j-1>=0&&nums[i][j-1]=='*') p.add(new int[]{i,j-1});
            //右
            if (j+1<m&&nums[i][j+1]=='*') p.add(new int[]{i,j+1});

            nums[i][j]='#';
            //上
            if (i-1>=0&&nums[i-1][j]!='#'&&nums[i-1][j]!='*') q.add(new int[]{i-1,j});
            //下
            if (i+1<m&&nums[i+1][j]!='#'&&nums[i+1][j]!='*') q.add(new int[]{i+1,j});
            //左
            if (j-1>=0&&nums[i][j-1]!='#'&&nums[i][j-1]!='*') q.add(new int[]{i,j-1});
            //右
            if (j+1<m&&nums[i][j+1]!='#'&&nums[i][j+1]!='*') q.add(new int[]{i,j+1});
        }

        System.out.println(Arrays.deepToString(nums));
//        while (!p.isEmpty()){
//
//        }

        return  -1;
    }
}
