package 数据结构与算法.排序;

public class 查找第k大的数字 {
    public  static  void helper (int []arr,int low,int high,int k){
        int temp;
        int i=low,j=high;
        if(i==j){
            System.out.print(arr[j]);
            return;
        }
        if(i<j){
            temp=arr[low];
            while(i<j){
                while(i<j&&arr[j]>temp){
                    j--;
                }
                if(i<j){
                    arr[i]=arr[j];
                    i++;
                }
                while(i<j&&arr[i]<=temp){
                    i++;
                }
                if(i<j){
                    arr[j]=arr[i];
                }
            }
            arr[i]=temp;
            if(i+1==k){
                System.out.print(arr[j]);
                return;
            }else if (i+1>k){
                helper(arr,low,i-1,k);
            }else{
                helper(arr,i+1,high,k);
            }
        }
           //return -1;
    }
}
