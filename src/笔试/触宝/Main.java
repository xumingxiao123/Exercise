package 笔试.触宝;
import java.util.*;
public class Main {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];  //英语补习班  1 开课  0 不开课
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr2=new int[n];   //数学补习班
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        int count=n;
        for(int j=0;j<n-1;j++){
            if(arr1[j]==1&& arr2[j]==0){
                if(arr2[j+1]==1)
                    count--;
            }
            else if(arr2[j]==1&& arr1[j]==0){
                if(arr1[j+1]==1)
                    count--;
            }else if(arr2[j]==1&& arr1[j]==1){
                count--;
            }

        }
        System.out.println(count);
    }
}
