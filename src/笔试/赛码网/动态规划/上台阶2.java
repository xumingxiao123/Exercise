package 笔试.赛码网.动态规划;
import java.util.Scanner;

public class 上台阶2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        上台阶2 m = new 上台阶2();
        while(sc.hasNext()) {
            int num = sc.nextInt();
            for(int i=0; i<num; i++) {
                System.out.println(m.Fan(sc.nextInt()));
            }
        }

    }
    public int Fan(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(n == 3) return 2;
        return Fan(n-1)+Fan(n-2);
    }
}
