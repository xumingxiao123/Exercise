package 笔试.华为;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] nums= {{0,1,4},{3,3,3}};
        int[][] arr=helper(nums);
       // System.out.print(Arrays.deepToString(arr));
    }
    public  static int[][] helper(int[][] nums){
        int[][] arr1=new int[4][4];
        int[][] arr2=new int[4][4];
        //扩散第一个数组
        arr1[nums[0][0]][nums[0][1]]=nums[0][2];
        helper1(arr1,nums[0][0],nums[0][1]);
        //扩散第二个数组
        arr2[nums[1][0]][nums[1][1]]=nums[1][2];
        helper1(arr1,nums[1][0],nums[1][1]);
        System.out.print(Arrays.deepToString(arr1));
        //最后比较数组取最大值
        for (int a=0;a<nums.length;a++){
            for (int b=0;b<nums[0].length;b++){
               if(arr1[a][b]<arr2[a][b]){
                   arr1[a][b]=arr2[a][b];
               }
            }
        }
        return arr1;
    }
    public  static  void helper1(int[][] arr,int m,int n){
        //左右扩散所在行
        // m是行 ，n 是列
        for (int a=n;a-1>=0;a--){
            arr[m][a-1]=arr[m][a]-1;
        }
        for (int a=n;a+1<arr.length;a++){
            arr[m][a+1]=arr[m][a]-1;
        }
        //上下进行扩散
        for (int k=0;k<arr[0].length;k++) {
            //向上扩散
            for (int b = m; b-1 > 0; b--) {
                arr[b-1][k] = arr[b][k] - 1;
            }
            //向下扩散
            for (int b = m; b+1 < arr[0].length; b++) {
                arr[b+1][k] = arr[b][k] - 1;
            }
        }
    }

}
