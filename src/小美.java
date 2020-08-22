import java.util.Scanner;

public class 小美 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums1=new int [n];
        int[] nums2=new int [n];
        for(Integer i:nums1){
            i=cin.nextInt();
        }
        for(Integer j:nums2){
            j=cin.nextInt();
        }
        System.out.println(nums1);
        System.out.println(nums2);
    }
}
