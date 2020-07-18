package 数据结构与算法.数组.DFS;

public class 矩阵最小路径_递归 {
    public static void main(String[] args) {
    //int [][] matrix=new int[3][3];
    int matrix[][]={{1,2,3},{1,2,3},{1,2,3}};
    System.out.println(process(matrix,0,0));
    }
    public static int process(int [][] matrix,int i,int j){
        /**
         * @param matrix : 矩阵
         * @param i ： 当前位置的行号
         * @param j ：当前位置的列号
         * @return ：到达最后位置时的最小路径和
         */
        // 当前位置已经在右下角了
        if(i==matrix.length-1&&j==matrix[0].length-1){
            return matrix[i][j];
        }
        // 当前位置处在最后一行时，只能向右走
        if(i==matrix.length-1){
            return matrix[i][j]+ process(matrix,i,j+1);
        }
        // 当前位置处在最后一列时，只能向下走
        else if(j==matrix[0].length-1){
            return matrix[i][j]+ process(matrix,i+1,j);
        }else{
            int right=matrix[i][j]+ process(matrix,i,j+1);
            int down=matrix[i][j]+ process(matrix,i+1,j);
            return Math.min(right,down);
        }
    }
}
