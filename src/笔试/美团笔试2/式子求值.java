package 笔试.美团笔试2;

import java.util.Scanner;

public class 式子求值 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        //int[] nums=new int[n];
        int s=-1;
        for (int j=0;j<n;j++){
            int b=cin.nextInt();
            for (int i=1;i<=n;i++){
                b=b^((j+1)%i);
            }
            if (j==0){
                s=b;
            }else {
                s=s^b;
            }
        }

        System.out.print(s);

    }
}
