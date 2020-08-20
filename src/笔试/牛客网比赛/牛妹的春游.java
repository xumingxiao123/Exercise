package 笔试.牛客网比赛;
/**
 * 众所周知，牛妹要组织公司的出游。要准备面包和饮料。她买到的面包和饮料都是捆绑销售的，
 * 也就是说，一个大包装里面x个面包+y个饮料，花费t元。
 * 为了满足公司的要求，需要一定数量的面包和饮料。
 * 你的任务就是帮助牛妹计算，为了满足公司需要，一共最少花费多少钱。
 * 5,60,[[3,36,120],[10,25,129],[5,50,250],[1,45,130],[4,20,119]]
 */

public class 牛妹的春游 {

    public static void main(String[] args) {
        int[][] packageSum={{3,36,120},{10,25,129},{5,50,250},{1,45,130},{4,20,119}};
        System.out.print(minCost(5,60,packageSum));

    }
    /**
     *
     * @param breadNum int整型
     * @param beverageNum int整型
     * @param packageSum int整型二维数组 每个一维数组中有三个数，依次表示这个包装里面的面包数量、饮料数量、花费
     * @return int整型
     */

    private static  int minCost (int breadNum, int beverageNum, int[][] packageSum) {
        // write code here
        // write code here
        int[][] dp = new int[breadNum + 1][beverageNum + 1];

        int size = packageSum.length;
        for(int i=0;i<=breadNum;i++)
        {
            for(int j=0;j<=beverageNum;j++)
            {
                dp[i][j] = 99999;
            }
        }
        //不需要面包和饮料时不花钱
        dp[0][0] = 0;
        for(int k=0;k<size;k++)    //第一层循环，遍历所有货品
        {
            for(int i=breadNum;i>=0;i--)    //第二层循环，枚举需要的面包数
            {     //倒序原因：滚动数组策略，省略了上一个货品时的空间，即当前dp[i][j]实际保存的是上一个货品dp的状态
                for(int j=beverageNum;j>=0;j--)     //二维背包问题，三维数组滚动优化为二维数组
                {
                    dp[i][j] = Math.min(dp[i][j],
                            dp[Math.max(i-packageSum[k][0], 0)][Math.max(j-packageSum[k][1], 0)]
                                    + packageSum[k][2]);
                }
            }
        }
        return dp[breadNum][beverageNum];
    }
}
