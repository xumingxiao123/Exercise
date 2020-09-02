package 笔试.同城;

public class 求500以内的正整数 {
    public static void main(String[] args) {
        System.out.print(question(100,200));
    }
    public static  int question (int a, int b) {
        // write code here
        for(int i=0;i<=500;i++){
            if(helper(a+i)&&helper(b+i)){
                return  i;
            }
        }
        return 0;
    }
    public static boolean helper(int num){
        if(num<0) return  false;
        for(int i=0;i<=num/2;i++){
            if(i*i==num)
                return  true;
        }
        return  false;
    }
}
