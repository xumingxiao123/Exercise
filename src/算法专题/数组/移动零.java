package 算法专题.数组;

public class 移动零 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        for(Integer n:nums){
            System.out.print(n);
        }

    }
    /*-----------将不为0的数字移动到数组前面----------------*/
    private static void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=0){
               nums[index++]=nums[i];
           }
        }
        for(int j=index;j<nums.length;j++){
            nums[j]=0;
        }
    }
}

