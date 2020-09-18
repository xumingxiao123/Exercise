package 笔试.欧科云链;

public class 二分查找 {
    public static void main(String[] args) {

    }
    public int search (int[] nums, int target) {
        // write code here
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
