package 数据结构与算法.数组.DFS;

public class 机器人的运动范围_dfs {
    public static void main(String[] args) {
        //标记数组
        int matrix[][]=new int[5][5];
        boolean mark[][]=new boolean[matrix.length][matrix[0].length];
        //mark[0][0]=1;
        System.out.println(dfs(matrix,0,0,3,mark));
    }
    public static  int dfs(int matrix[][],int i,int j,int temp,boolean mark[][]) {
        /**
         * @param i ： 行数
         * @param j ： 列数
         * @param temp ： 阈值
         * @return 步数
         **/
        if (i < 0 || i >= matrix.length||j < 0||j >= matrix[0].length||mark[i][j] == true||check(i)+check(j)>temp) {
            return 0;
        } else{
            mark[i][j] = true;
        }
        //
        return dfs(matrix,i,j+1,temp,mark)
        +dfs(matrix,i+1,j,temp,mark)
        +dfs(matrix,i,j-1,temp,mark)
        +dfs(matrix,i-1,j,temp,mark)
         +1;

    }
    //求和
        public static int check(int n) {
            int sum = 0;
            do{
                sum += n%10;
            }while((n = n/10) > 0);
            return sum;
    }
}
