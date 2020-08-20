package 数据结构与算法.回溯算法;
import java.lang.reflect.Array;
import java.util.*;

public class N皇后问题 {
    public static void main(String[] args) {

        List<List<String>> list= solveNQueens(8);
        for(List<String> n:list){
            for(String m:n){
              System.out.println(m);
            }
            System.out.println("");
        }
    }
    //全局变量的lists集合
    static  List<List<String>> res=new ArrayList<>();
    public  static  List<List<String>> solveNQueens(int n) {
        if(n<1) return res;
        List<Integer> list=new ArrayList<>();
        //需要所在行数，结束条件，存储数组
        helper(0,n,list);
        return res;
    }
    //结束条件就是所有行都有一列有值，且列不重复
    private  static  void helper(int row,int n,List<Integer> list){
        //满足条件，构造N皇后列
        if(row==n){
          List<String> strList=new ArrayList<>();
          for(Integer nums:list){
              char[] t=new char[n];
              Arrays.fill(t,'.');
              t[nums]='Q';
              //这就是数组转字符串的方法
              strList.add(new String(t));
          }
          res.add(strList);
          return;
        }
        //每一列都尝试一下
        for(int col=0;col<n;col++){
            //当前列是否合阀
            if(!list.contains(col)){
                //判断左斜和右斜是否合法
                if(isDiagonalAttack(list)) {
                    list.add(col);
                    //继续搜索下一列
                    helper(row + 1, n, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
    private static  boolean isDiagonalAttack(List<Integer> currentQueen) {
        //需要判断的列
        int y = currentQueen.size();
        //当前行
        //判断每一行的皇后的情况，
        for (int x = 0; x < y; x++) {
            //如果存在对角，那么行差==列差的绝对值（因为存在右对角）
            if (y - x== Math.abs(currentQueen.get(y-1)- currentQueen.get(x))) {
                return false;
            }
        }
        return true;
    }    //判断一棋盘时候是否符合要求，其实就是不要出现斜线吃子的情况
//    private static boolean isLegal(List<Integer> nums){
//        for(int i = 0; i<nums.size(); i++){
//            for(int j = i+1; j<nums.size(); j++){
//                if(Math.abs(nums.get(i) - nums.get(j)) == j-i)
//                    return false;
//            }
//        }
//        return true;
//    }
}
