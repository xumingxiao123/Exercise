package 笔试.好未来;

import java.util.Scanner;

public class 走迷宫 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a=cin.nextInt();
        int b=cin.nextInt();
        char[][] nums=new char[a][b];
        for (int i=0;i<a;i++){
            String s = cin.next();
            for (int j=0;j<b;j++){
               nums[i][j]=s.charAt(j);
            }
        }
        int count=0;
        int i=0;
            for (int j=0;j<b;j++){
                if (nums[i][j]=='.') count++;
            }

         i=a-1;
            for (int j=0;j<b;j++){
                if (nums[i][j]=='.') count++;
            }

        int j=0;
        for (i=0;i<a;i++){

                if (nums[i][j]=='.') count++;
        }
        j=b-1;
        for ( i=0;i<a;i++){

                if (nums[i][j]=='.') count++;
        }
        if (count>1){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }
}
