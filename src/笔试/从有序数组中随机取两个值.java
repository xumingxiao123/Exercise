package 面试;

public class 从有序数组中随机取两个值 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int a=(int)(Math.random()*nums.length);
        System.out.println(nums[a]);
    }
}
