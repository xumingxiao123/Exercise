package 笔试.华为;

import java.util.Arrays;
import java.util.Scanner;

public class 数字排列2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        //AppearanceLeftValue
        int[] ALeftValue=new int[n];
        //AppearanceRightValue
        int[] ARightValue=new int[n];
        StringBuilder S1=new StringBuilder();
        for (int i=0;i<n;i++){
            ALeftValue[i]=cin.nextInt();
        }
        for (int i=0;i<n;i++){
            ARightValue[i]=cin.nextInt();
        }
        for (int i=0;i<n;i++){
            ALeftValue[i]=ALeftValue[i]+ARightValue[i]*10;
            S1.append(ALeftValue[i]);
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
        StringBuilder S2=new StringBuilder();
        for (int i=0;i<m;i++){
            LeftValue[i]=LeftValue[i]+RightValue[i]*10;
            S2.append(LeftValue[i]);
        }

//        String aLeftValue= Arrays.toString(ALeftValue);
//        String leftValue= LeftValue.toString();
//        System.out.println(S1.toString());
//        System.out.println(S2.toString());
       int nn=kmpMatch(S2.toString(),S1.toString());
//        for (nn=0;nn<m-n+1;nn++){
//            if (LeftValue[nn]==ALeftValue[0]){
//                int count=nn;
//                Boolean b=true;
//                for (int mm=0;mm<n;mm++){
//                    if (LeftValue[count]!=ALeftValue[mm]){
//                        b=false;
//                        break;
//                    }
//                    count++;
//                }
////                if (b){
////                    for (int mm=0;mm<n;mm++){
////                        if (RightValue[count]!=ARightValue[mm]){
////                            b=false;
////                            break;
////                        }
////                    }
////                }
//                if (b){
//                    break;
//                }
//            }
//        }
//
            //System.out.println(0);
         if (nn==-1){
             System.out.println(0);
         }else{
             System.out.println(nn/2+1);
         }



    }
    public static int[] getNextArray(String  t) {

        int[] next = new int[t.length()+1];
        int i=1,j=0;
        next[1]=0;
        while(i<t.length()){
            if(j==0||t.charAt(i)==t.charAt(j)){
                next[i+1]=j+1;
                i++;
                j++;
            }else{
                j=next[j];
            }
        }
        return next;
    }

    /**
     * 对主串s和模式串t进行KMP模式匹配
     * @param s 主串
     * @param t 模式串
     * @return 若匹配成功，返回t在s中的位置（第一个相同字符对应的位置），若匹配失败，返回-1
     */
    public static int kmpMatch(String s, String t){
        //char[] s_arr = s.toCharArray();
        //char[] t_arr = t.toCharArray();
        int[] next = getNextArray(t);
        int i = 0, j = 0;
        while (i<s.length() && j<t.length()){
            if(j == 0 || s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else
                j = next[j];
        }
        if(j == t.length())
            return i-j;
        else
            return 0;
    }

}
