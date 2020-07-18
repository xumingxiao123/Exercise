package 数据结构与算法.数组.斐波那契数列;

//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
public class 跳台阶 {
    public static void main(String[] args) {
         int temp= helper(8);
         System.out.println(temp);
    }
    private static int helper(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return  helper(n-1)+helper(n-2);
    }
}
