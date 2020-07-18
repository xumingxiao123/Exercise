package 数据结构与算法.数组.DFS; /**
 * Created by xu on 2020/4/7.
 */

import java.util.List;
import java.util.LinkedList;
//1、public：public表明该数据成员、成员函数是对所有用户开放的，所有用户都可以直百接进行调用
//2、private：private表示私有，私有的意思就是除了class自己之外，任何人都不可以直接使用。
public class 全排列数字dfs {
    //定义测试用例
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        res = permute(nums);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
//定义一个存储数组的表
     public static List<List<Integer>> res = new LinkedList<>();
/* 主函数，输入一组不重复的数字，返回它们的全排列 */
     public static List<List<Integer>>  permute(int[] nums) {
            // 记录「路径」，每一条路径也是一组排列
            LinkedList<Integer> track = new LinkedList<>();
            backtrack(nums, track);
            return res;
        }

// 路径：记录在 track 中
// 选择列表：nums 中不存在于 track 的那些元素
// 结束条件：nums 中的元素全都在 track 中出现
    public static void  backtrack(int[] nums, LinkedList<Integer> track) {
        // 触发结束条件
        if (track.size() == nums.length) {
            res.add(new LinkedList(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // 排除不合法的选择
            if (track.contains(nums[i]))
               continue;
            // 做选择
            track.add(nums[i]);
            // 进入下一层决策树
            backtrack(nums, track);
            // 取消选择
            track.removeLast();
        }
    }
}
