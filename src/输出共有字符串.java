import java.util.ArrayList;
import java.util.HashMap;

public class 输出共有字符串 {
        /**
         *
         * @param values string字符串ArrayList<ArrayList<>>
         * @return string字符串ArrayList
         */
        public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
            // write code here
            ArrayList<String> list= new ArrayList<>();
            HashMap<String,Integer> map= new HashMap<>();
            int lenx=values.size();
            for (ArrayList<String> value : values) {
                for (String s : value) {
                    if (!map.containsKey(s)) {
                        map.put(s, 0);
                    } else {
                        map.put(s, map.get(s) + 1);
                    }
                    if (map.get(s) == lenx) {
                        list.add(s);
                    }
                }
            }
            return  list;
        }

}
