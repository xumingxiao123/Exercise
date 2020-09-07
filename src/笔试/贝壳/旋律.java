package 笔试.贝壳;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

public class 旋律 {
    public static void main(String[] args) {
        String s1="63231323";
        String s2="53231323";
        String s3="43231323";
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            String s=scan.next();
            String s4=scan.next();
            StringBuilder stringBuffer=new StringBuilder();
            for(int j=0;j<s.length();j++){
                if (s.charAt(j)=='1'){
                    stringBuffer.append(s1);
                }
                else if (s.charAt(j)=='2'){
                    stringBuffer.append(s2);
                }
                else  if (s.charAt(j)=='3'){
                    stringBuffer.append(s3);
                }
            }
            int count=getKeyStringCount(s4,stringBuffer.toString());
//            for (int x=0;x<s4.length()-stringBuffer.length()+1;x++){
//                String s5=s4.substring(x,x+stringBuffer.length());
//                if (s5.equals(stringBuffer.toString())){
//                    count++;
//                }
//            }
            list.add(count);
        }
        for(Integer mm:list){
            System.out.println(mm);
        }
    }
    public static int getKeyStringCount_2(String str, String key) {//方法2
        int count = 0;
        int index = 0;
        while((index = str.indexOf(key,index))!=-1){
            index = index + key.length();
            count++;
        }
        return count;
    }

    /**
     * 获取子串在整串中出现的次数。
     * @param str
     * @param key
     * @return
     */
    public static int getKeyStringCount(String str, String key) {//方法1

        //1,定义计数器。
        int count = 0;

        //2，定义变量记录key出现的位置。
        int index = 0;

        while((index = str.indexOf(key))!=-1){

            str = str.substring(index+key.length());
            count++;
        }
        return count;
    }
//    public static int index(String s, String t) {
//        int i=0,j=0,k=0;
//        while(i<s.length() && j<t.length()){
//            if(s.charAt(i)==t.charAt(j)){
//                i++;
//                j++;
//            }else{
//                i=++k;
//                j=0;
//            }
//        }
//        if (j==t.length()){
//            return k;
//        }else{
//            return -1;
//        }
//    }

}
