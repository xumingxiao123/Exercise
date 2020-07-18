package 数据结构与算法.排序;

/**
 * Created by xu on 2020/4/12.
 */
public class 快速排序找第k个大的数 {


    public static void sortArray(int[] nums,int low ,int hight, int k) {
        int temp;
        int i=low,j=hight;
        /*
        此处需要格外注意，由于递归函数中进行了运算导致hight == low，且不会进入if中，所以要额外判断
         */
        if(hight == low ) {
            System.out.print(nums[low]);
            return;
        }
        if(low<hight){
            temp=nums[low];
            while(i!=j)
            {
                while(j>i&&nums[j]>=temp){
                    j--;
                }
                if(i<j){
                    nums[i]=nums[j];
                    i++;
                }
                while(j>i&&nums[i]<temp){
                    i++;
                }
                if(i<j){
                    nums[j]=nums[i];
                    j--;
                }
            }
            nums[i]=temp;
             /*
        由于此时i==j，基准nums[j]位置已经固定不会再动。并且将数组分为左、右两部分，左部分数小于nums[j],右部分数大于nums[j]，
        1. 如果j==k，那么说明枢纽j所在位置的值就为第k大的值
        2. 如果j>k，那么要求的位置一定在左部分，递归排序左部分即可
        3. 如果j<k，那么要求的位置一定在右部分，递归排序右部分即可
         */
            if(j==k){
            System.out.print(nums[j]);
            return;
            }
            else if(j>k){
                sortArray(nums,low ,j-1,k);
            }
            else{
                sortArray(nums,j+1,hight,k);
            }
        }
    }
}
