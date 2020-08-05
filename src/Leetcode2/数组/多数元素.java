package Leetcode2;

public class 多数元素 {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.print(majorityElement(nums));
    }
    private static int majorityElement(int[] nums) {
        int temp=nums[0];
        int index=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp){
                index++;
            }else{
                if(index==1){
                    temp=nums[i];
                }else{
                    index--;
                }
            }
        }
        return temp;
    }
}
