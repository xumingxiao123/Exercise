package 笔试.猿辅导专题;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//
public class 猿辅导1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] nums=new int [n][3];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
            nums[i][2]=sc.nextInt();
        }

        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        }) ;

        int x_end=nums[0][1];
        int sum=0;
        int max=0;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,nums[i][2]);
                if(nums[i+1][0]>x_end){
                    sum=max+sum;
                    x_end=nums[i][1];
                    max=0;
                }

            }
      max=Math.max(max,nums[n-1][2]);
      sum=sum+max;
      System.out.print(sum);
    }
}
