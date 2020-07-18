package 数据结构与算法.数组.滑动窗口;
/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * * 数列满足递增，设两个头尾两个指针i和j，
 * 1. 若ai + aj == sum，就是答案（相差越远乘积越小）
 * 2. 若ai + aj > sum，aj肯定不是答案之一（前面已得出 i 前面的数已是不可能），j -= 1
 * 3. 若ai + aj < sum，ai肯定不是答案之一（前面已得出 j 后面的数已是不可能），i += 1
 */
public class 和为S的两个数字 {
    public static void main(String[] args) {
        int[] num={1,2,4,5,6,7,8,9};
        int arr[]=helper(num,11);
        System.out.println(arr[0]+" "+arr[1]);
    }
    private  static int [] helper(int [] arr,int sum){
        int [] num=new int [2];
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                num[0]=arr[i];
                num[1]=arr[j];
                return num;
            }else if(arr[i]+arr[j]<sum){
                //这个时候可以确定i处及之前的值与最大的值都无法构成sum,所以可以排除
                i++;
            }else {
                //这个时候可以确定j处及之前的值与最小的值都无法构成sum,所以可以排除
                j--;
            }
        }
        num[0]=-1;
        num[1]=-1;
        return num;
    }

}
