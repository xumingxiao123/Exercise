package 笔试.度小满;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 坚强的小昆虫二 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int t = Integer.parseInt(st);
        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int n =Integer.parseInt(strs[0]);    //行数
            int m =Integer.parseInt(strs[1]);    //列数

            char[][] board = new char[n][m];
            int x = -1;
            int y = -1;
            for (int j = 0; j < n; j++) {
                String s = sc.nextLine();
                for (int k = 0; k < m; k++) {
                    board[j][k]=s.charAt(k);
                    if (board[j][k] == '@') {
                        x = k;    //列号
                        y = j;    //行号
                    }
                }
            }
            boolean[][] used = new boolean[n][m];
            int[][] move = new int[4][2];
            move[0][0]=0;
            move[0][1]=1;
            move[1][0]=0;
            move[1][1]=-1;
            move[2][0]=1;
            move[2][1]=0;
            move[3][0]=-1;
            move[3][1]=0;

            PriorityQueue<Integer> list = new PriorityQueue<>();
            //System.out.println(t +" "+n+ " "+m+" "+x+" "+y );
            dis(x,y,board,used,list,0,move);
            if(list.size()>0){
                System.out.println(list.poll());
            }else{
                System.out.println("-1");
            }
        }
    }

    public static void dis(int x,int y,char[][] board,boolean[][] used, PriorityQueue<Integer> list,int count,int[][] move){
        if(x<=0||x>=board[0].length-1||y<=0||y>=board.length-1){     //第3个或写成了与
            //System.out.println(count);
            list.add(count);
            return;
        }
        for (int i = 0; i < 4; i++) {
            x=x+move[i][0];
            y=y+move[i][1];
            if(x>=0&&x<board[0].length&&y>=0&&y<board.length&&!used[y][x]){
                used[y][x] = true;
                if (board[y][x]=='*'){
                    dis(x,y,board,used,list,count+1,move);
                    // System.out.println(count);
                }else if (board[y][x]=='.'){
                    dis(x,y,board,used,list,count,move);
                }

                used[y][x] = false;
            }
            x-=move[i][0];
            y-=move[i][1];
        }
    }
}

