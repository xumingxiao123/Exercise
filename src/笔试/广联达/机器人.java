package 笔试.广联达;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 机器人 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] nums=new double[n][3];
        for (int i=0;i<n;i++){
            nums[i][0]=scanner.nextDouble();
            nums[i][1]=scanner.nextDouble();
            nums[i][2]=nums[i][1]/nums[i][0];
        }
       System.out.println(Arrays.deepToString(nums));
        Arrays.sort(nums, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                if(o2[2]!=o1[2]){
                    return (int) (o2[2]-o1[2]);
                }
                else if (o1[1]!=o2[1]){
                    return (int) (o2[1]-o1[1]);
                }
                else{
                    return (int) (o2[0]-o1[0]);
                }
            }
        });
       System.out.println(Arrays.deepToString(nums));
//        double count=0;
//        int i=0;
//        double mm=m;
//        while (mm-nums[i][0]>=0){
//            count=count+nums[i][1];
//            mm=mm-nums[i][0];
//            i++;
//        }
        double count=0;
        double mm=m;
        for(int i=0;i<n;i++){
            if (mm-nums[i][0]>=0){
                count=count+nums[i][1];
                mm=mm-nums[i][0];
            }
        }
        System.out.println((int) count);
    }
}
