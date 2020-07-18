package 数据结构与算法.查找;

public class 折半查找 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,6,7,8,9,10};
        int low=0;
        int high=arr.length;
        int k=8;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
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
