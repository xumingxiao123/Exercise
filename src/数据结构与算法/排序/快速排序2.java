package 数据结构与算法.排序;

public class 快速排序2 {
    //public  static int [] sort(int []arr){
     //   //int []nums=new int[];
     //   help(arr,0,arr.length-1);
     //   return  arr;
    //}
    public static  void help(int[] arr,int low,int high){
        int temp;
        int i=low,j=high;
        if(low<high){
            temp=arr[low];
            while(i!=j){
                while(i<j&&arr[j]>temp){
                    j--;
                }
                if(i<j){
                    arr[i]=arr[j];
                    i++;
                }
                while (i<j&&arr[i]<=temp){
                    i++;
                }
                if(i<j){
                    arr[j]=arr[i];
                    j--;
                }
            }
            arr[i]=temp;
            help(arr,low,i-1);
            help(arr,i+1,high);
        }
    }
}
