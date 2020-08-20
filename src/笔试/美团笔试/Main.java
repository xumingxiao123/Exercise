package 笔试.美团笔试;

import java.util.ArrayList;
import java.util.Scanner;
/*
203323
0.0
0.000000
0.009212121
343444323.32432
-12344.1
-12345678.9
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        System.out.println();
        while (sc.hasNext()){
            System.out.println(change(sc.nextLine()));
        }
    }
    private static String change(String str) {
        int index = 0;
        boolean t = true;
        if(str.charAt(0) == '-') {
            str = str.substring(1);
            t = false;
        }
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '.') {
                index = i;
            }
        }
        if(str.length() - index > 2 && index != 0) {
            str = str.substring(0, index+3);
        }else if(str.length() - index -1 == 2 && index != 0) {
            str = str;
        }else if(str.length() - index -1 == 1 && index != 0) {
            str = str + "0";
        }else{
            //可能出错
            str = str + ".00";
        }
        for(int i = 0;i < str.length();i++) {
            if(str.charAt(i) == '.') {
                index = i;
            }
        }

        int count = 0;
        for(int i = str.length()-4;i > 0;i--) {
            count++;
            if(count == 3) {
                str = str.substring(0,i) + "," + str.substring(i);
                count = 0;
            }
        }
        str = "$" + str;
        if(!t) {
            str = "(" + str + ")";
        }

        return str;
    }

}