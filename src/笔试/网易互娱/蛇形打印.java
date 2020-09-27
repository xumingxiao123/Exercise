package 笔试.网易互娱;

import java.util.Arrays;
import java.util.Scanner;

public class 蛇形打印 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        while(c > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] ans = new int[M];
            int[][] nums = new int[N][N];
            int value=1;
            int up = 0;
            int down = N-1;
            int left = 0;
            int right = N-1;
            for (int i=0;i<=N/2+1;i++){

                value=getShunDigit(nums,N,value,up,down,left,right);
                 up = up+1;
                 down = down-1;
                 left = left+1;
                 right = right-1;
                 value=AntiClockWise(nums,N,value,up,down,left,right);
                up = up+1;
                down = down-1;
                left = left+1;
                right = right-1;

            }
           // System.out.print(Arrays.deepToString(nums));
            int index = 0;
            while(M > 0) {

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
    private static int getShunDigit(int[][] arr,int N,int value,int up,int down,int left,int right) {

//        while(true) {
            for(int i = left;i <= right;i++) {
                arr[up][i] = value++;
            }
            up += 1;
            if(up > down) {
                return value;
            }
            for(int i = up;i <= down;i++) {
                arr[i][right] = value++;
            }
            right -= 1;
            if(right < left) {
                return value;
            }

            for(int i = right;i >= left;i--) {
                arr[down][i] = value++;
            }
            down -= 1;
            if(down < up) {
                return value;
            }

            for(int i = down;i >= up;i--) {
                arr[i][left] = value++;
            }
            left += 1;
            if(left > right) {
                return value;
            }
//        }
           return value;

    }

    public static int AntiClockWise(int[][] arr,int N,int value,int up,int down,int left,int right) {


//        while(true) {
            for(int i = up;i <= down;i++) {
                arr[i][left] = value++;
            }
            left += 1;
            if(left > right) {
                return value;
            }


            for(int i = left;i <= right;i++) {
                arr[down][i] = value++;
            }
            down -= 1;
            if(down < up) {
                return value;
            }

            for(int i = down;i >= up;i--) {
                arr[i][right] = value++;
            }
            right -= 1;
            if(right < left) {
                return value;
            }

            for(int i = right;i >= left;i--) {
                arr[up][i] = value++;
            }
            up += 1;
            if(up > down) {
                return value;
            }
//        }

        return value;
    }




}

