import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 岛屿 {
    //深度遍历代码
    static  ArrayList<ArrayList<Character>> lists=new ArrayList<>();
    static  ArrayList<Character> list =new ArrayList<>();
    static void dfs (char[][] grid, int r, int c){
        //去行列
        int nr = grid.length;
        int nc = grid[0].length;
        //行列不能越界，而且不能为“水”
        if(r < 0 || c < 0 || r >= nr || c >= nc){
            list.remove(list.size()-1);
            return;
        }
        //置为“水”
        list.add(grid[r][c]);
        if(list.size()==5&&list.get(1)=='H'&&list.get(2)=='I'&&list.get(3)=='N'&&list.get(4)=='A'){
            lists.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        //这个地方是递归，在你寻找一个1的时候就开始深度遍历，直到遇见0，才结束
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
    //主函数
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [][] grid=new char[n][n];
        for(int i=0;i<n;i++){
            String S=sc.next();
            for(int j=0;j<n;j++){
                grid[i][j]=S.charAt(j);
            }
        }

        //数组不能为null
        if(grid == null || grid.length == 0){
            System.out.print(0);
        }
        //行，列长度
        int nr = grid.length;
        int nc = grid[0].length;
        //岛屿数量
        //遍历行列
        for(int r = 0; r < nr; ++r){
            for(int c = 0; c < nc; ++c){
                //当为1，那么这个就是小岛，并且将相邻的都置为0
                if (grid[r][c] == 'C'){
                    dfs(grid, r, c);
                }
            }
        }
        System.out.print(lists.size());
    }
}
