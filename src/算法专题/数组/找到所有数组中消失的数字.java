package Leetcode2.数组;

import java.util.ArrayList;
import java.util.List;

public class 找到所有数组中消失的数字 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};//输出5,6
        List<Integer> list=findDisappearedNumbers(nums);
        for(Integer n:list){
            System.out.print(n);
        }
    }
    private static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        //将当前数字对应的索引标记为负
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        //根据索引求出没有的值
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0){
                list.add(j+1);
            }
        }
        return list;
    }
}
