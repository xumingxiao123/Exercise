package 笔试.三六零;

import java.util.ArrayList;
import java.util.Scanner;

public class 验证密码复杂性 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> listResult=new ArrayList<>();
        while(cin.hasNextLine()){
            list.add(cin.next());
        }
        for (String n:list){
            int t1=0;
            int t2=0;
            int t3=0;
            int t4=0;
            for (int i = 0; i< n.length(); i++){
                if (Character.isDigit(n.charAt(i))){
                    t1++;
                }
                else if (Character.isUpperCase(n.charAt(i))){
                    t2++;
                }
                else if (Character.isLowerCase(n.charAt(i))){
                    t3++;
                }
                else {
                    t4++;
                }

            }
            if(t1>0&&t2>0&&t3>0&&t4>0&& n.length()>=8){
                listResult.add("Ok");
                //System.out.print("Ok");
            }else{
                listResult.add("Irregular password");
                //System.out.print("Irregular password");
            }
            for (String m:listResult){
                System.out.println(m);
            }
        }


    }
}
