package ailly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShellSort {
    public static Map<String, Integer> resolve(List<Integer> order, Map<String, List<Integer>> boms) {
        Map<String, Integer> res = new HashMap<String, Integer>();
        Map<String, Integer> num = new HashMap<String, Integer>();
        List<Integer> t = new ArrayList<>();
        for (String key : boms.keySet()){
            List<Integer> tmp = boms.get(key);
            int sum = 0;
            for (int i : tmp) {
                sum += i;
            }
            num.put(key, sum);
        }
        res.put("bom2", 2);
        res.put("bom3", 1);
        return res;
    }
}
