package 笔试.网易;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 最大子序列和 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(cin.hasNextInt()) {
            list.add(cin.nextInt());
        }
        int sum=0;
        int[] nums=new int[list.size()];
        for (int i=0;i<list.size();i++){
            nums[i]=list.get(i);
            sum=sum+nums[i];
        }
        Arrays.sort(nums);

        if (sum%7==0){
            System.out.print(sum);
        }else{
            int t=sum%7;
            System.out.print(sum-t);
//
//            for (int i=0;i<nums.length;i++){
//                if (nums[i]==t){
//
//                }
//            }
            //System.out.print("-1");
        }


    }
}
