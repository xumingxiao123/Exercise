import java.util.Scanner;

public class 关键字排序 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        String s=cin.next();
        int[] nums=new int[n];
        System.out.println(s);
        for (int i=0;i<s.length();i++){
            if ()
        }
    }
    public  static  int [] arraySort(int [] nums){
        for(int j=1;j<nums.length;j++){
            boolean  M=false;
            for(int i=0;i<nums.length-j;i++){
                if(nums[i]>nums[i+1]){
                    int temp= nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    M=true;
                }
            }
            if(!M) return nums;
        }
        return nums;
    }
}
