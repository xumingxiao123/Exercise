package 笔试.贝壳笔试;

    import java.util.Scanner;

    public class 找不对 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
            // nextLine()方法返回的是输入回车之前的所有字符
            String s = sc.nextLine();
            System.out.println(s);
            char[] c = s.toCharArray();

            int count  = 0;
            int i = 0, j = c.length-1;
            while(i < j) {
                if(c[i] != c[j]) {
                    count++;
                }
                i++;
                j--;

            }

            System.out.println(count);
        }

    }
