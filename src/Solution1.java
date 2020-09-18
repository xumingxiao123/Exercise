import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
      int[] nums={0,1,0,3,12};
      moveZeroes(nums);
      System.out.print(Arrays.toString(nums));
    }
    public  static  void moveZeroes(int[] nums){
        int i=0;
        for (i=0;i<nums.length;i++){
           if (nums[i]==0) break;
        }
        for (int j=i+1;j<nums.length;j++){
            if (j!=0){
                //int temp=nums[i];
                nums[i]=nums[j];
                //nums[j]=temp;
                i++;
            }
        }
        for (int t=i;t<nums.length;t++){
            nums[t]=0;
        }
    }
}
