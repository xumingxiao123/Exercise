package leetcode;

public class 二分查找 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10,11};
        int k;
        helper(nums,9);
    }
    public static  void  helper(int[] nums,int k){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==k){
                System.out.println(mid);
                return;
            }
            if(nums[mid]<k){
                left=mid+1;
            }
            if(nums[mid]>k){
                right=mid-1;
            }
        }
    }
}
