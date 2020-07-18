package 数据结构与算法.其他.源码;

import java.util.ArrayList;
import java.util.Arrays;

public class arrary {
    public static void main(String[] args) {
        int[] arr= {1,3,2,4};
        ArrayList<integer> list=new ArrayList<>();
        //Arrays.binarySearch(arr,2)针对已经排序的数组
        //System.out.println(Arrays.binarySearch(arr,2));
        Arrays.sort(arr);
        //[I@1b6d3586
       // System.out.println(arr);
        //
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //Arrays.binarySearch(arr,2)如果找不到，那么返回一个负数，等于-（插入点+1），插入点表示，在这个位置插入没找到的元素，可以保证原数组有序
        System.out.println(Arrays.binarySearch(arr,2));
        String str=Arrays.toString(arr);
            System.out.println(str);

          int[] n; //只声明了一数组变量；//使用length时，Error:(29, 29) java: 可能尚未初始化变量n
        int [] num=null;//声明一数组变量，并赋值 null,不指向任何对象；使用length时，Exception in thread "main" java.lang.NullPointerException
        int [] nums= new int[0];//声明并创建一数组对象，长度是0；使用length时，length为0


         System.out.println(nums.length);
    }

}
