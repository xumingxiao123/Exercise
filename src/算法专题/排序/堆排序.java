package 算法专题.排序;

public class 堆排序 {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        int[] num=headSort(arr);
        for(Integer n:num){
            System.out.print(n+" ");
        }
    }
    private static int[] headSort(int[] arr) {
        int len=arr.length;
        //初始化堆
        for(int i=len/2-1;i>=0;i--){
            helper(arr,i,len);
        }
        for (int j=len-1;j>0;j--){
            int temp= arr[0];
            arr[0]=arr[j];
            arr[j]=temp;
            helper(arr,0,j);
        }
        return  arr;
    }
    private static void helper(int[] arr, int i, int len) {
        int index=2*i+1,temp;
        while(index<len){
            if(index+1<len&&arr[index]<arr[index+1]){
                index++;
            }
            if(arr[i]<arr[index]){
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                i=index;
                index=2*i+1;
            }else{
                break;
            }
        }

    }
}
