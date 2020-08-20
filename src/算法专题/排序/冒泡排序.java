package 算法专题.排序;

public class 冒泡排序 {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        int[] num=bubbleSort(arr);
        for(Integer n:num){
            System.out.print(n+" ");
        }
    }
    /**
     * 每次将最大的值交换到最后
     */
    /*----------------冒泡排序-----------------*/
    private static int[] bubbleSort(int[] arr) {
        int i,j;
        int temp;
        boolean k;
        //最多需要进行arr.length-1次
        for(i=0;i<arr.length;i++){
            k=false;
            //退出条件为一次遍历没有发生过交换
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    k=true;
                }
            }
            if(!k) break;
        }
        return arr;
    }
}
