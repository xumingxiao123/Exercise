package 数据结构与算法.排序;

/**
 * Created by xu on 2020/4/12.
 */
public class 快速排序 {

    public static void sortArray(int[] nums,int low ,int hight) {
        int temp;
        int i=low,j=hight;
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
            sortArray(nums,low ,i-1);
            sortArray(nums,j+1,hight);
        }
    }
}
