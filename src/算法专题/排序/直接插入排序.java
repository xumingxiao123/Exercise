package 算法专题.排序;

public class 直接插入排序 {
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        int[] num=insertSort(arr);
        for(Integer n:num){
            System.out.print(n+" ");
        }
    }
    /*--------------直接插入排序------------------*/
    private static int[] insertSort(int[] arr) {
        //将待插入的值临时存储，并且将小于其的值后移
        int temp;
        int i,j;
        for(i=1;i<arr.length;i++){
            temp=arr[i];
            j=i;
            while (j>0&&temp<=arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            //最终覆盖即可
            arr[j]=temp;
        }
        return  arr;
    }
}
