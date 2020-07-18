package 数据结构与算法.查找;

public class 折半查找递归 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,6,7,8,9,10};
        helper(arr,0,arr.length-1,5);
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
