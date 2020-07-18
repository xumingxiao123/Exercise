package 数据结构与算法.数组.DFS;
//https://blog.csdn.net/pcwl1206/article/details/97389894
public class 机器人走路_递归实现 {
    public static void main(String[] args) {
        /**
         * @param N ：共N个位置
         * @param M ：开始位置
         * @param P ：可以走的步数
         * @param K ： 目标位置
         * @return
         **/
        int N=15;
        int M=5;
        int P=7;
        int K=10;
        System.out.println(walk(N,M,P,K));
    }
    public static int walk(int N,int M,int P,int K){
        //当步数为0并且达到终点时，返回1
        if(P==0){
            return M==K?1:0;
        }
        //开始位置和结束位置只能往一个方向走
        if(M==1) {
            return walk(N, M + 1, P - 1, K);
        }else if(M==N){
            return walk(N,M-1,P-1,K);
        }else{
            // 向左走和向右走两种选择，每次只能走一步
            return walk(N,M-1,P-1,K)+walk(N,M+1,P-1,K);
        }

    }

}
