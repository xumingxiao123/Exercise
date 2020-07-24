package 面试;

public class 排序 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2,5,8,4,5,1,2,4,5,44,1,5,785,1552,1522,457,1251,1451,3445,7822,125};
        help(arr);
        for(Integer i:arr){
            System.out.print(i+" ");
        }

    }
    public static void help(int[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                int count =i;
                if(arr[j]<arr[count]){
                    count=j;
                }
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
            }
        }
    }
}
