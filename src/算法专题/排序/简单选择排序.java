package 算法专题.排序;

public class 简单选择排序 {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        int[] num=SelectSort(arr);
        for(Integer n:num){
            System.out.print(n+" ");
        }
    }
    /*---------- --简单选择排序 ----------------*/
    /**
     * 每次找出最小的值与第一个值交换
     */
    private static int[] SelectSort(int[] arr) {
        //需要有一个index实时记录最小值的下标
        int i,j,index;
        int temp;
        for(i=0;i<arr.length;i++){
            index=i;
            //挑选一个最小关键字
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            //交换
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
        return  arr;
    }
}
