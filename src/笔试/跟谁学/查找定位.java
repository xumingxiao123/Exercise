package 笔试.跟谁学;

import java.util.ArrayList;
import java.util.Scanner;

public class 查找定位 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        while(cin.hasNextInt())
        {
            int a = cin.nextInt();
            list.add(a);
        }
        int[] nums=new int[list.size()-1];
        int k;
        for (int i=0;i<list.size()-1;i++){
            nums[i]=list.get(i);
        }
        k=list.get(list.size()-1);
        helper(nums,0,nums.length-1,k);
    }
    public  static void helper(int[]arr,int low,int high,int k){
        if(k < arr[low] || k > arr[high] || low > high){
            return;
        }
        int mid=(low+high)/2;
        if(arr[mid]==k){
            System.out.println(mid);
            return;
        }else if(arr[mid]<k){
            helper(arr,mid+1,high,k);
        }else{
            helper(arr,low,mid-1,k);
        }
    }
}
