package 笔试.美团笔试;

import java.util.Scanner;
//给定一串可重复的,排序后的数字,查找指定数字最后一次出现的位置
//比如 1 2 2 2 3 4 4 8
public class 查找数字 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int k = 2;
            int length = 8;
            int[] arr=new int[length];
            for(int i=0;i<length;i++){
                arr[i]=in.nextInt();
            }
            //k
            int low=0,high=length-1,mid;
            while(low<high){
                mid=(low+high)/2-1;
                if(arr[mid]>k){
                    high=mid-1;
                }else if(arr[mid]<k){
                    low=mid+1;
                }else{
                    int temp=mid;
                    for(int i=mid;i<high;i++){
                        if(arr[i+1]!=temp){
                            System.out.println(i);
                            return;
                        }
                    }
                }
            }
        }
}
