import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
       // 배열을 배열의 n번째 문자와 매칭해서 정렬한다
        //만약에 n번째 문자가 같다면, 
            String[] result =  Arrays.stream(strings)
                    .sorted(Comparator.comparing((String s) -> s.charAt(n))
                            .thenComparing(s -> s)).toArray(String[]::new);
        
        return result;
    }
}