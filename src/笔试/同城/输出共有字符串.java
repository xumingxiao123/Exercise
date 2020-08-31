package 笔试.同城;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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
            if (values==null) return list;
            HashMap<String,Integer> mapx;
            int lenx=values.size();
            for (ArrayList<String> value : values) {
                mapx= new HashMap<>();
                for (String s : value) {
                    if (!map.containsKey(s)) {
                        map.put(s, 0);
                    }
                    else if (map.containsKey(s)){
                        map.put(s, map.get(s) + 1);
                    }
                    //mapx.put(s,0);
                    if (map.get(s) == lenx&&!list.contains(s)) {
                        list.add(s);
                    }
                }
            }
            return  list;
        }

}
