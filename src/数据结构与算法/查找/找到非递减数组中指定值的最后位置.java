package 数据结构与算法.查找;

public class 找到非递减数组中指定值的最后位置 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,6,7,8,9,10};
        int low=0;
        int high=arr.length;
        int k=5;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                //if(arr[mid+1]!=arr[mid]){
                //    System.out.println(mid);
                //}
                while(arr[mid+1]==arr[mid]){
                    mid++;
                }
                System.out.println(mid);
                break;
            }else if(arr[mid]<k){
                low=mid+1;
            }else {
                high=mid-1;
            }

        }
    }
}
