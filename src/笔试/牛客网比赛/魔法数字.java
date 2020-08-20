package 笔试.牛客网比赛;
/**
 *         一天，牛妹找牛牛做一个游戏，牛妹给牛牛写了一个数字n，然后又给自己写了一个数字m，她希望牛牛能执行最少的操作将他的数字转化成自己的。
 * 操作共有三种，如下：
 *         1.在当前数字的基础上加一，如：4转化为5
 *         2.在当前数字的基础上减一，如：4转化为3
 *         3.将当前数字变成它的平方，如：4转化为16
 *         你能帮牛牛解决这个问题吗?
 * */
public class 魔法数字 {
    public static void main(String[] args) {
       System.out.print( solve(3,10));
    }
    private static int solve (int n, int m) {
        if(m<=n) return n-m;
        int k=(int)Math.sqrt((double)m);
        if(m - k * k > (k + 1) * (k + 1) - m) k++;//如果k平方与m的差值大于k+1平方与m的差值，则迭代计算n,k+1的操作数
        // write code here
        return Math.min(m - n, solve(n, k) + 1 + Math.abs(m - k * k));
    }
}
