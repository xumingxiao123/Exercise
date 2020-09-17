public class DELETE {
    public static void main(String[] args) {

    }

    private  static  int  helper(int[] nums){
        int i=0;
        int j=1;
        while (j<nums.length){
            if (nums[i]!  M =nums[j]){
                i++;
                j++;
            }else{
                while (nums[i]==nums[j]){
                    j++;
                }
                nums[i+1]=nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}
