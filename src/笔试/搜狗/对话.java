package 笔试.搜狗;

import java.util.Arrays;

public class 对话 {
    public static int numberofprize (int a, int b, int c) {
        // write code here
        int[] nums=new int[3];
        nums[0]=a;
        nums[1]=b;
        nums[2]=c;
        Arrays.sort(nums);
        


    }

    public static void main(String[] args) {
        System.out.println(numberofprize (4,4,2));
    }
}
