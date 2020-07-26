package 笔试;

public class 字符串循环右移 {
    public static void main(String[] args) {
        String pStr ="abcdefghi";
        int steps=2;
        //String pStr ="hiabcdefg";
        char[] chars1=new char[pStr.length()];
        //char[] chars2=new char[2];
        for(int i=0;i<pStr.length()-steps;i++){
            chars1[steps+i]=pStr.charAt(i);
        }
        int m=0;
        for(int j=pStr.length()-steps;j<pStr.length();j++){
            chars1[m]=pStr.charAt(j);
            m++;
        }
        //String qStr=chars1.toString();
        //for(char n:chars1){
       // System.out.print(n);
       // }
      // System.out.print(qStr);

    }

}
