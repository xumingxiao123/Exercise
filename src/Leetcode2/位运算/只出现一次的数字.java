package Leetcode2;

public class 只出现一次的数字 {
    public static void main(String[] args) {
       int[] nums ={4,1,2,1,2};
       System.out.print(singleNumber(nums));
    }
    /*-----------------使用位运算----------------*/
    private static  int singleNumber(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            temp^= nums[i];
        }
        return temp;

    }
    /*-----------使用hashmap,比较麻烦----------------*/
    private static  int singleNumber2(int[] nums) {

        return 0;

    }
}
