package 笔试.广联达;
import java.util.*;
public class 各不相同 {
   public static void setAdd(Set<Integer> set,Integer i){
       if(!set.add(i)){
        set.remove(i);
        setAdd(set,i<<1);
       }
    }  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  }
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            setAdd(res,array[i]);  }
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext())
                System.out.print(" "); }
    }

}
