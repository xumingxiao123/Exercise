package 数据结构与算法.其他.源码;

public class Tangyuan {
        private static String skin;
        private String stuffing;
        @Override
        public String toString() {
            return "Tangyuan{ skin='"+ skin + "',stuffing='" + stuffing + "'}";
        }
        public static void main(String[] args){
            Tangyuan.skin = "糯米皮";
            Tangyuan t1 = new Tangyuan();
            t1.stuffing = "花生馅";
            Tangyuan t2 = new Tangyuan();
            t2.stuffing = "芝麻馅";
            System.out.println(t1);
            System.out.println(t2);
        }
}
