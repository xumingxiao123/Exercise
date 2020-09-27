package 笔试.网易互娱;

import java.util.Arrays;
import java.util.Scanner;

public class 蛇形打印2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while(c > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] ans = new int[M];
            int up = 0;
            int down = N-1;
            int left = 0;
            int right = N-1;
            int[][] nums = new int[N][N];
            getNums(nums,N,left,right,up,down);
            System.out.println(Arrays.deepToString(nums));
            while(M > 0) {




                int index = 0;
                int x = sc.nextInt();
                int y = sc.nextInt();

                ans[index++] = nums[x][y];
                M--;
            }
            for(int i = 0;i < ans.length;i++) {
                System.out.println(ans[i]);
            }
            c--;
        }
    }
    static int value = 1;

    private static void getShunDigit(int[][] arr,int left,int right,int up,int down) {

        for(int i = left;i <= right;i++) {
            arr[up][i] = value++;
        }
        up ++;


        for(int i = up;i <= down;i++) {
            arr[i][right] = value++;
        }
        right --;


        for(int i = right;i >= left;i--) {
            arr[down][i] = value++;
        }
        down --;


        for(int i = down;i >= up;i--) {
            arr[i][left] = value++;
        }
        left ++;


    }

    public static void AntiClockWise(int[][] arr,int left,int right,int up,int down) {

        for(int i = up;i <= down;i++) {
            arr[i][left] = value++;
        }
        left ++;


        for(int i = left;i <= right;i++) {
            arr[down][i] = value++;
        }
        down --;


        for(int i = down;i >= up;i--) {
            arr[i][right] = value++;
        }
        right --;

        for(int i = right;i >= left;i--) {
            arr[up][i] = value++;
        }
        up ++;

    }

    public static void getNums(int[][] arr,int N,int left,int right,int up,int down) {
        int count = 0;
        while(count <= N/2) {
            if(count % 2 == 0) {
                getShunDigit(arr,left,right,up,down);
            }else {
                AntiClockWise(arr,left,right,up,down);
            }
            count++;
        }
    }

}