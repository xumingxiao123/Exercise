package 笔试.最右;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    // -7 6 -3 2   ->1
    // -7 6 -3 2 1 ->3
    public static void main(String[] args) {
        int[] nums={0,2,1};
        System.out.print(helper(nums));
    }
    public static  int helper(int[] nums){
        ArrayList<Integer> list=new ArrayList<>();
        //list
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                }

            }
        }
        //arr
        int[] arr=new int[list.size()];
        for (int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        //arr排序
        Arrays.sort(arr);
        int k=0;
        //遍历
        // arr[k] 1    3       4
        // k      0+1 1+1(2)  2+1
         for (k=0;k<arr.length;k++){
            if (arr[k]!=k+1){
                return k+1;
            }
        }
        return k+1;
    }
}
