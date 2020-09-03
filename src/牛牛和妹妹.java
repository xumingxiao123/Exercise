import java.util.ArrayList;
import java.util.Scanner;

public class 牛牛和妹妹 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N=cin.nextInt();
        int M=cin.nextInt();
        int[] nums=new int[N];
        int i=0;
        for (int count=N-M+1;count>0;count--){
            nums[i]=count;
            i++;
        }
        int m=N;
        for (int j=nums.length-1;j>=N-M+1;j--){
            nums[j]=m;
            m--;
        }
        for (Integer p:nums){
         System.out.print(p+" ");
        }
    }
}
