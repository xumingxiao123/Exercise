import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//
public class 猿辅导1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] nums=new int [n][2];
        for(int i=0;i<n;i++){
            nums[i][0]=sc.nextInt();
            nums[i][1]=sc.nextInt();
        }
//        for(int i=0;i<n;i++){
//            System.out.print(nums[i][0]);
//            System.out.println(nums[i][1]);
//        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        }) ;
//        for(int i=0;i<n;i++){
//            System.out.print(nums[i][0]);
//            System.out.println(nums[i][1]);
//        }

        //int x_end=nums[0][1];

//        for(int[] interval:nums){
//            int start =interval[0];
//            if(start>x_end){
//                count++;
//                x_end=interval[1];
//            }
//        }
        int max=-1;
        for(int j=0;j<n;j++){
            int count=1;
            //int start=nums[j][0];
            int end=nums[j][1];
            for(int i=j+1;i<n;i++){
                if(nums[i][0]<end){
                    count++;
                }
            }
            max=Math.max(max,count);
        }
        System.out.print(max);
    }
}
