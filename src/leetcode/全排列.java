package leetcode;

import java.util.LinkedList;
import java.util.List;

public class 全排列 {

    static LinkedList<LinkedList<Integer>> lists =new LinkedList<>();
    public static void main(String[] args) {
        int[] nums={1,2,3};
        LinkedList<Integer> list=new LinkedList<>();
        helper(list,nums);
        for(LinkedList<Integer> n:lists){
            for(Integer m:n){
                System.out.print(m);
            }
            System.out.println();
        }
    }
// 路径：记录在 list 中
// 选择列表：nums 中不存在于 list 的那些元素
// 结束条件：nums 中的元素全都在 list 中出现
    public static void helper(LinkedList<Integer> list,int[] nums){
        if(list.size()==nums.length){
            lists.add(new LinkedList<>(list));
        }
        //遍历整个数组
        for(int i=0;i<nums.length;i++){
            //如果值已经遍历过则退出
            if(list.contains(nums[i])){
                continue;
            }
            //加入数字
            list.add(nums[i]);
            //递归
            helper(list,nums);
            //移除结点 撤销选择
            list.removeLast();
        }

    }
}
