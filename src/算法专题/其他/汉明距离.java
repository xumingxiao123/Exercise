package Leetcode2.其他;

public class 汉明距离 {

    public static void main(String[] args) {
        System.out.print(hammingDistance(1, 4));

    }
    public static  int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int distance = 0;
        while (xor != 0) {
            distance += 1;
            // remove the rightmost bit of '1'
            xor = xor & (xor - 1);
        }
        return distance;
    }
}
