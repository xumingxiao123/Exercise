package leetcode;

import java.util.HashMap;

// nums = [2, 7, 11, 15], target = 9，返回两数之和的下标
public class 两数之和 {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;
        int [] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else{
                arr[0]=map.get(target-nums[i]);
                arr[1]=i;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
