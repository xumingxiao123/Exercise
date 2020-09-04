import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 李华的礼物 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int m=cin.nextInt();
        int k=cin.nextInt();
        int [][] arr=new int[n][3];
        for (int i=0;i<n;i++){
            arr[i][0]=cin.nextInt();
            arr[i][1]=cin.nextInt();
            arr[i][2]=cin.nextInt();
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[2]==o2[2]&&o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[2]==o2[2]?o1[0]-o2[0]:o2[2]-o1[2];
                }
            }
        });
        int count=0;
        for (int i=0;i<n;i++){
            if(arr[i][0]>k||arr[i][1]>m){
                continue;
            }else {
                count++;
                k-=arr[i][0];
                m-=arr[i][1];
            }
        }
        System.out.println(count);
    }
}
