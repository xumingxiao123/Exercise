package 数据结构与算法.其他.源码;

public class equals {
    public static void main(String[] args) {
        //比较基本类型
        int m=1;
        int n=1;
        // System.out.println(m.equals(n)); // 报错
        System.out.println(m == n);  // true
        //System.out.println(m.hashCode());  // 报错
        //System.out.println(n.hashcode());  // 报错
        /*
        key不能为基本数据类型，则是因为基本数据类型不能调用其hashcode()方法和equals()方法，进行比较，
        所以HashMap集合的key只能为引用数据类型，不能为基本数据类型
        * */
         //比较字符串
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);  // true
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.hashCode());  //96354
        System.out.println(s2.hashCode());  //96354
        //比较封装类型
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        System.out.println(x.equals(y)); // true
        System.out.println(x == y);      // false
        System.out.println(x.hashCode());   //1  why???
        System.out.println(y.hashCode());   //1  why???
        //比较封装类型2
        Integer x1 = 127;
        Integer y1 = 127;
        System.out.println(x1.equals(y1)); // true
        System.out.println(x1 == y1);      // true
        System.out.println(x1.hashCode());   //1  why???
        System.out.println(y1.hashCode());   //1  why???
        //比较封装类型3
        Integer x2 = 128;
        Integer y2 = 128;
        System.out.println(x2.equals(y2)); // true
        System.out.println(x2 == y2);      // false
        System.out.println(x2.hashCode());   //1  why???
        System.out.println(y2.hashCode());   //1  why???
        //
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1==str2); //false
        System.out.println(str1.hashCode());   //99162322  why???
        System.out.println(str2.hashCode());   //99162322  why???

        String str3 = "abcd";  //在string池里
        String str4 = new String("abcd");//创建对象的实例，都是在堆里
        System.out.println(str3==str4);//false
        System.out.println(str4.equals(str3));//ture


    }
}
