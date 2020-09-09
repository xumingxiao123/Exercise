package 笔试.华为;

import java.util.Scanner;

public class 数字排列 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        //AppearanceLeftValue
        int[] ALeftValue=new int[n];
        //AppearanceRightValue
        int[] ARightValue=new int[n];
        for (int i=0;i<n;i++){
            ALeftValue[i]=cin.nextInt();
        }
        for (int i=0;i<n;i++){
            ARightValue[i]=cin.nextInt();
        }
        int m=cin.nextInt();
        int[] LeftValue=new int[m];
        //AppearanceRightValue
        int[] RightValue=new int[m];
        for (int i=0;i<m;i++){
            LeftValue[i]=cin.nextInt();
        }
        for (int i=0;i<m;i++){
            RightValue[i]=cin.nextInt();
        }
        int nn=-1;
        for (nn=0;nn<m-n+1;nn++){
            if (LeftValue[nn]==ALeftValue[0]){
                int count=nn;
                Boolean b=true;
                for (int mm=0;mm<n;mm++){
                    if (LeftValue[count]!=ALeftValue[mm]||RightValue[count]!=ARightValue[mm]){
                        b=false;
                        break;
                    }
                    count++;
                }
//                if (b){
//                    for (int mm=0;mm<n;mm++){
//                        if (RightValue[count]!=ARightValue[mm]){
//                            b=false;
//                            break;
//                        }
//                    }
//                }
                if (b){
                    break;
                }
            }
        }
        if (nn==-1){
            System.out.println(0);
        }else{
            System.out.println(nn+1);
        }

    }
}
