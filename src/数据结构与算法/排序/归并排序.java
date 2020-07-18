package 数据结构与算法.排序;

public class 归并排序 {
    public  static void main(int[]arr){
         sort(arr,0,arr.length-1);
         for(int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
    }
    public  static  void sort(int[]arr ,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            helper(arr,low,mid,high);
        }
    }
    public  static  void helper(int []arr,int low,int mid,int high){
        int []nums=new int[high-low+1];
        int l=low,m=mid+1,h=high,i=0;
        while(l<=mid&&m<=high){
            if(arr[l]<arr[m]){
                nums[i]=arr[l];
                i++;
                l++;
            }
            if(arr[l]>=arr[m]){
                nums[i]=arr[m];
                i++;
                m++;
            }
        }
        while(l<=mid){
            nums[i]=arr[l];
            i++;
            l++;
        }
        while(m<=high){
            nums[i]=arr[m];
            i++;
            m++;
        }
        for(int j=0;j<nums.length;low++,j++){
            arr[low]=nums[j];
        }
    }
}
