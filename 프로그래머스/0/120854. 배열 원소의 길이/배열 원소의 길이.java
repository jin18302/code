import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> list = new ArrayList<>();

        for( String str: strlist){
            list.add (str.length());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}