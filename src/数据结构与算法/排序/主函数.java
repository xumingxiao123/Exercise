package 数据结构与算法.排序;


public class 主函数 {
    public static void main(String[] args) {
        int[] nums = {6,8,3,9,5,10,1,7,4,2};
        //冒泡排序.arraySort(nums);
        //System.out.println(" ");
        //快速排序找第k个大的数.sortArray(nums,0,nums.length-1,7);
        //System.out.println(" ");
        //查找第k大的数字.helper(nums,0,nums.length-1,8);
        //System.out.println(" ");
        //最小的k的个数.help(nums,0,nums.length-1,6);
        //System.out.println();

        //归并排序.main(nums);
        堆排序.headSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
