package 笔试.搜狗;

import java.util.Arrays;

public class 对话 {
    public static int numberofprize (int a, int b, int c) {
        // write code here
        int[] nums=new int[3];
        nums[0]=a;
        nums[1]=b;
        nums[2]=c;
        int sum=0;
        while (true){
            Arrays.sort(nums);
            sum=nums[0]+sum;
            for (int i=0;i<3;i++){
                nums[i]=nums[i]-nums[0];
            }
            int count=0;
            for (int i=0;i<3;i++){
                if (nums[i]==0){
                    nums[i]++;
                    count=2;
                }
                if (nums[i]>1&&count>0){
                    nums[i]--;
                    count--;
                }
            }
            if (count>0){
                break;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(numberofprize (4,4,2));
    }
}
