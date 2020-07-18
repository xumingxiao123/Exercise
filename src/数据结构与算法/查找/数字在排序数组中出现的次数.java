package 数据结构与算法.查找;

public class 数字在排序数组中出现的次数 {
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,5,5,5,5,5,5,6,7,8,9,10};
            int low=0;
            int high=arr.length;
            int k=5;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==k){
                    //if(arr[mid+1]!=arr[mid]){
                    //    System.out.println(mid);
                    //}
                    int i=1;
                    int temp=mid;
                    while(mid+1<arr.length&&arr[mid+1]==arr[mid]){
                        mid++;
                        i++;
                    }
                    mid=temp;
                    while (mid-1>=0&&arr[mid-1]==arr[mid]){
                        mid--;
                        i++;
                    }
                    System.out.println(i);
                    break;
                }else if(arr[mid]<k){
                    low=mid+1;
                }else {
                    high=mid-1;
                }

            }
        }
    }

