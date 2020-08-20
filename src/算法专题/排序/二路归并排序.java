package 算法专题.排序;

public class 二路归并排序 {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        int[] num= MergeSort(arr,0,arr.length-1);
        for(Integer n:num){
            System.out.print(n+" ");
        }
    }
    /*-------------二路归并排序-----------------*/
    private static int[] MergeSort(int[] arr,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            //分治思想
            MergeSort(arr,low,mid);
            MergeSort(arr,mid+1,high);
            //归并函数
            helper(arr,low,mid,high);
        }
        return  arr;
    }
    //归并函数
    private static void helper(int[] arr, int low, int mid, int high) {
        int[] temp=new int [high-low+1];
        int i=low,j=mid+1;
        int k=0;
        //两个有序数组归并算法
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, low, temp.length);//(被复制的数组，从几号下标开始复制，复制到哪个数组，复制到新数组第几号下标，复制长度)
    }


}
