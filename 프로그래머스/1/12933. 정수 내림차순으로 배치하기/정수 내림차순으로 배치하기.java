import java.util.*;

class Solution {
    
     static public long solution(long n) {
       String s = n + "";//숫자의 길이를 구한다
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            long value = n % 10;
            list.add(value);//리스트에 숫자를 하나씩 요소로 추가한다

            n /= 10;//뒤에서부터 하나씩 없앤다
        }


        Collections.sort(list);//기본순으로 정렬한다
        String tmp = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            tmp += list.get(i);
        }

        return Long.parseLong(tmp);
    }
}