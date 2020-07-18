package 数据结构与算法.数组.随机算法;

public class 洗牌算法 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        //混沌系统
        Double u=3.99;
        Double a[]=new Double[16];
        a[0]=0.8;
        for(int i=0;i<15;i++){
            a[i+1]=(u*a[i]*(1-a[i]))%1;
        }
        //Math.random()可以产生0-1之间的随机数
        int b[]=new int[16];
        for(int i=0;i<16;i++){
            b[i]=(int)(a[i]*16);
        }
        // ‘ascend’升序'descend‘降序’

        //费雪耶兹置乱
        for(int i=0;i<16;i++){
            int temp=arr[b[i]];
            arr[b[i]]= arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<16;i++){
            System.out.println(arr[i]);
        }
    }
}
