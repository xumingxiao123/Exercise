package 其他.广联达笔试;
//有一种排序算法，只能把一个元素提到序列的开头
//例如2 1 3 4 ，只需要一次即可。
//请实现这种排序算法，并返回交换的次数
// 4          4
// 2 1 3 4    4 3 2 1
//输出：1      输出4
//4
//2 1 3 4
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//
public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        //使用链表存储节点
        LinkedList<Integer> list =new LinkedList<>();
        list.add(sc.nextInt());
        for(int i=1;i<n;i++) {
            int temp=sc.nextInt();
            //这个时候不用做
            if(temp>list.getLast()){
                list.add(temp);
            }else {
                list.addFirst(temp);
                count++;
                if(temp<=list.get(1)){
                    continue;
                }else{
                    int m=0;
                    while(m+1<i&&list.get(m+1)<list.get(temp)){
                        m++;
                    }
                    //System.out.println(m);
                    int s=m;
                    while(m>0){
                        int temp1=list.remove(s);
                        list.addFirst(temp1);
                        count++;
                        m--;
                    }
                }
            }
            }

        System.out.println(count);
        //for(Integer nn:list){
        //    System.out.print(nn);
       // }
        }

    }