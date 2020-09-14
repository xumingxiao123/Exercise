package 笔试.巨人网络;

import java.util.Arrays;

public class 逆时针旋转矩阵 {
    public static void main(String[] args) {
        int[][] matrix={{0,1,2},{3,4,5},{6,7,8}};
        System.out.println(Arrays.deepToString(RotateMatrix(matrix)));

    }
    public static int[][] RotateMatrix (int[][] matrix) {
        // write code here
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] nums=new int[n][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                nums[n-j-1][i]=matrix[i][j];
            }
        }
        return nums;
    }
}
