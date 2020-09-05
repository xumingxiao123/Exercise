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
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==k){
                break;
            }else if(nums[mid]<k){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        if (nums[mid]==k){
            System.out.println(mid);
        } else{
            if (nums[mid]<k){
                System.out.println(low);
            }else{
                System.out.println(high);
            }

        }
    }

}
