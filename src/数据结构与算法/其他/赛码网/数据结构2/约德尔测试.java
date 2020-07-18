package 数据结构与算法.其他.赛码网.数据结构2;

/*
兰博和提莫闲聊之后，回归到了他们的正题，约德尔人的未来。
说起约德尔人的未来，黑默丁格曾经提出了一个约德尔测试，将约德尔人的历史的每个阶段都用一个字符表达出来。(包括可写字符,不包括空格。)。
然后将这个字符串转化为一个01串。转化规则是如果这个字符如果是字母或者数字，这个字符变为1,其它变为0。
然后将这个01串和黑默丁格观测星空得到的01串做比较，得到一个相似率。相似率越高,则约德尔的未来越光明。
请问:相似率为多少？
*/
import java.util.Scanner;
/*
样例输入
@!%12dgsa
010111100
样例输出
66.67%
 */
public class 约德尔测试 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String history = in.nextLine();
        String star = in.nextLine();
        String transHis = "";
        for (int i = 0; i < history.length(); i++) {
            char c = history.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                transHis = transHis + "1";
            } else {
                transHis = transHis + "0";
            }
        }
        int same = 0;
        for (int i = 0; i < transHis.length(); i++) {
            if (star.charAt(i) == transHis.charAt(i)) {
                same++;
            }
        }
        float out = (float) same * 100 / (float) transHis.length();
        System.out.printf("%.2f%%", out);
    }
}