package 数据结构与算法.数组.滑动窗口;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 双指针技术：就是相当于有一个窗口，窗口的左右两边就是两个指针，我们根据窗口内值之和来确定窗口的位置和宽度。
 */
public class 和为S的连续正数序列 {
    public static void main(String[] args) {
        helper(100);
    }
    private static ArrayList<ArrayList<Integer>>helper(int sum){
        int low=1,high=2;
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        while(low>high){
            if((low+high)*(high-low+1)/2==sum){
              ArrayList<Integer> list=new ArrayList<>();
              for(int i=low;i<=high;i++){
                  list.add(i);
              }
              lists.add(list);
              //这里还需要继续移动
                low++;
            }else if((low+high)*(high-low+1)/2<sum){
                high++;
            }else {
                //都是向前移动的
                low++;
            }
        }
        return lists;
    }
}
