package 数据结构与算法.数组.动态规划;

public class 矩阵最小路径_动态规划 {
    public static void main(String[] args) {
        //int [][] matrix=new int[3][3];
        int matrix[][]={{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(process(matrix));
    }
    public static int process(int [][] matrix){
        /**
         * @param matrix : 矩阵
         * @param i ： 当前位置的行号
         * @param j ：当前位置的列号
         * @return ：到达最后位置时的最小路径和
         */

        int lastRow = matrix.length - 1;     // lastRow：代表最后一行的行号，所以要减1
        int lastCol = matrix[0].length - 1;
        // 构建可变参数为 i 和 j 的二维状态表,这里必须要+1，因为是矩阵的大小
        int[][] dp = new int[lastRow + 1][lastCol + 1];

        // 找递归过程的 baseCase,即不需要依赖其他状态的，即右下角位置
        // 右下位置到其本身的距离即为它本身的大小
        dp[lastRow][lastCol] = matrix[lastRow][lastCol];

        // 填充最后一行位置的 dp：从右往左推
        for(int i = lastRow, j = lastCol - 1; j >= 0; j--){
            // 左边位置的dp值等于右边位置的dp值加上自身的数值
            dp[lastRow][j] = matrix[lastRow][j] + matrix[lastRow][j + 1];
        }
        // 填充最后一列位置的 dp：从下往上推
        for(int i = lastRow, j = lastCol; i >= 0; i--){
            //
            dp[i][lastCol] = matrix[i][lastCol] + dp[i][lastCol];
        }
        // 填充一般位置的 dp（即：除最后一行和最后一列的位置）
        for(int i = lastRow - 1; i >= 0; i--){
            for(int j = lastCol - 1; j >= 0; j--){
                // 一般位置：当前位置值 + min(下边位置的dp值, 右边位置的dp值)
                dp[i][j] = matrix[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
            }
        }
        return dp[0][0];   // 返回目标位置的值
    }
}
