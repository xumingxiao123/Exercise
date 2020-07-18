package 数据结构与算法.数组.斐波那契数列;
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//        n<=39
public class 斐波那契数列 {
    public static void main(String[] args) {
        int temp=helper(4);
        System.out.println(temp);
    }
    private  static  int  helper(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        if(n==3)  return 1;

        return helper(n-1)+helper(n-2);
    }
}
