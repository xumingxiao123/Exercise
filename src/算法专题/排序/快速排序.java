package 算法专题.排序;

public class 快速排序 {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1,2,8,3};
        quickSort(arr,0,arr.length-1);
        for(Integer n:arr){
            System.out.print(n+" ");
        }
    }
    /*-----------------快速排序-----------------*/
    private static void quickSort(int[] arr,int low ,int high) {
        int i=low,j=high;
        //当仅剩一个数字时，此处i<j起了作用
        if(i<j){
           int temp=arr[low];
           //此处有一个循环，来进行左右指针切换
           while(i<j){
               //下方完成快排的逻辑
               while(i<j&&arr[j]>=temp){
                   j--;
               }
               if(i<j){
                   arr[i]=arr[j];
                   i++;
               }
               while(i<j&&arr[i]<temp){
                   i++;
               }
               if(i<j){
                   arr[j]=arr[i];
                   j--;
               }
           }
            arr[i]=temp;
           //递归进行
            quickSort(arr,low,i-1);
            quickSort(arr,j+1,high);
        }
    }
}
