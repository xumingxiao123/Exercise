package 数据结构与算法.排序;

public class 最小的k的个数 {
    public static  void help(int[] arr,int low,int high,int k){
        int temp;
        int i=low,j=high;
        if(i==j){
            for(int x=0;x<i+1;x++){
                System.out.println(arr[x]);
            }
            return;
        }
        if(low<high){
            temp=arr[low];
            while(i!=j){
                while(i<j&&arr[j]>temp){
                    j--;
                }
                if(i<j){
                    arr[i]=arr[j];
                    i++;
                }
                while (i<j&&arr[i]<=temp){
                    i++;
                }
                if(i<j){
                    arr[j]=arr[i];
                    j--;
                }
            }
            arr[i]=temp;
            if(i+1==k){
                for(int x=0;x<i+1;x++){
                   System.out.println(arr[x]);
                }
                //help(arr,i,high,k);
                return;
            }else if (i+1<k){
                help(arr,i+1,high,k);
            }else{
                help(arr,low,i-1,k);
            }
        }
    }
}
