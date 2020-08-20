package 其他.广联达笔试;
//3 5 怪物数量和攻击范围
//1 10 //怪物1位置和血量
//10 5 //怪物2位置和血量
// 22 3 //怪物3位置和血量
//输出 13
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AOE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            int temp1=sc.nextInt();
            int temp2=sc.nextInt();
            arr[i]=temp1;
            map.put(temp1,temp2);
        }
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer i:arr){
            list.add(i);
        }
        int sum=0;
        //每次删除一个结点
        while(list.size()!=0){
            //长度为这个
            n=list.size();
            //每次从0开始
            int i=0;
            //for(int i=0;i<n;i++){
                int j=i;
                while (j+1<n&&list.get(j+1)-list.get(i)<=2*m){
                    j++;
                }
                //System.out.println(list.get(j));
                //if(j!=n-1){
                   // j--;
                //}
                int min=i;
                int min_value=map.get(list.get(i));
                int t=i+1;
                //map.containsKey(list.get(t))&&
                while(t<=j){
                    if(map.get(list.get(t))<min_value){
                        min_value=map.get(list.get(t));
                        min=t;
                    }
                    t++;
                }
             //System.out.println(list.get(min)+" "+map.get(list.get(min)));
                //为最小值的下标
                int min1=list.get(min);
               // System.out.println(min1);
                sum=map.get(min1)+sum;
                // System.out.println(sum);
                for(int nn=i;nn<=j;nn++){
                    map.put(list.get(nn),map.get(list.get(nn))-map.get(min1)) ;
                }
                list.remove(min);
                //map.remove(list.get(min));
                //System.out.println(list.get(min));
                // return;
                // System.out.println(j);
           // }

        }
       System.out.println(sum);
        //System.out.println(list.get(2));
       // System.out.println(list.get(2));
       //System.out.println(map.get(1));
    }
}
