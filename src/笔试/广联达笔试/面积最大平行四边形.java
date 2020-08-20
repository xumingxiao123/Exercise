package 其他.广联达笔试;
//给你n条边长不一样的边，从中选出四条边，组成边长最大的平行四边形
//5
//3 3 3 4 5

//输出12

import java.util.HashMap;
import java.util.Scanner;

public class 面积最大平行四边形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //存储数字个数
        int n = sc.nextInt();
        //使用存储出现过的值
        HashMap<Integer,Integer> map= new HashMap<>();
        int max=-1;
        int max_value=0;
        int temp=0;
        //遍历每个元素
        for(int i=0;i<n;i++) {
            temp=sc.nextInt();
            //如果map里面有，则说明此数字重复，可以成为四边形的边
            if(map.containsKey(temp)){
                //当求出一条边重复的时候，存入
                if(max_value==0){
                    max_value=temp;
                //求面积的另外一个条件是，有另外一条相等的边
                }else{
                    //此时可以计算出最大面积，最大面积为正方形
                    max=Math.max(max,temp*max_value);
                    //如果现在的边比之前存储的边还要大，则存储最大的边
                    if(temp>max_value){
                        max_value=temp;
                    }
                }
                //这里存储一共出现了多少次，以供后面检测是否有问题
                map.put(temp,map.get(temp)+1);
            }
              map.put(temp,1);
        }
        //当没有进行计算时，说明不存在
        if(max==-1){
            System.out.print(-1);
        }
        //当存在时，可能出现 3 3 3 8 7这种问题，此时key=3的value必须大于4
        else if(max_value*max_value==max&&map.get(max_value)<4){
            System.out.print(-1);
        } else {
            System.out.print(max);
        }

    }
}
