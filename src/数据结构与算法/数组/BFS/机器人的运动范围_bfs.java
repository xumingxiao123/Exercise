package 数据结构与算法.数组.BFS;

/**
未完成
**/
public class 机器人的运动范围_bfs {
    public static void main(String[] args) {
        //标记数组
        int matrix[][]=new int[5][5];
        boolean mark[][]=new boolean[matrix.length][matrix[0].length];
        System.out.println(dfs(matrix,3,0));
    }
    public static  int dfs(int matrix[][],int temp,int count) {
        /**
         * @param i ： 行数
         * @param j ： 列数
         * @param temp ： 阈值
         * @return 步数
         **/
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(check(i)+check(j)>temp){
                     break;
                 }else{
                     count++;
                 }
             }
         }
         return count;

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
