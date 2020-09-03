import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 图像模糊化 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        int[][] nums=new int[m+2][n+2];

        //Arrays.fill(nums ,-1);
        for (int i=0;i<m+2;i++){
            for (int j=0;j<n+2;j++){
                nums[i][j]=-1;
            }
        }
        for (int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                nums[i][j]=cin.nextInt();
            }
        }
        for (int j=1;j<n+1;j++){
            for (int i=1;i<m+1;i++){
                int count=5;
                int sum=nums[i][j];
                if (nums[i-1][j]==-1){
                    count--;
                   // N=false;
                }else{
                    sum=sum+nums[i-1][j];
                }
                if (nums[i+1][j]==-1){
                    count--;
                   // U=false;
                }else{
                    sum=sum+nums[i+1][j];

                }
                if (nums[i][j-1]==-1){
                    count--;
                    //L=false;

                }else{
                    sum=sum+nums[i][j-1];
                }
                if (nums[i][j+1]==-1){
                    count--;
                   // R=false;
                }else{
                    sum=sum+nums[i][j+1];
                }
                nums[i][j]= (int) Math.round((double) sum/count);
            }

        }
        for (int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}
