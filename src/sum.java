import java.util.HashMap;
import java.util.Scanner;
//        int[] arr1={2,3,2,5};
//        int[] arr2={3,2,8};
// 找出arr1和arr2中相同的的元素求和。
public class sum {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        HashMap <Integer,Integer> map =new HashMap<>();
        int[] arr1={2,3,2,5};
        int[] arr2={3,2,8};
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
            }else{
                //这里用else
                map.put(arr1[i],map.get(arr1[i])+1);
            }
        }
        int sum=0;
        for(int j=0;j<arr2.length;j++){
            if(map.containsKey(arr2[j])){
                //计算数据下标，并不是计算值
                sum=sum+arr2[j]+map.get(arr2[j])*arr2[j];
                map.put(arr2[j],0);
            }
        }
        System.out.println(sum);
    }
}
