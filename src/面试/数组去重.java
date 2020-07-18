package 面试;

public class 数组去重 {
    public static void main(String[] args) {
        //有序数组去重不可使用数据结构
        int[] nums={1,1,1,2,3,4,5,5,5,};
        int i=0;
        int j;
        for(j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        int[] arr= new int[i+1];
        //(被复制的数组，从几号下标开始复制，复制到哪个数组，复制到新数组第几号下标，复制长度)
        System.arraycopy(nums, 0, arr, 0, i+1);
        for(Integer n:arr){
            System.out.print(n);
        }
    }
}

