import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String[]week = new String[]{"", "SUN", "MON", "TUE",
                                    "WED", "THU", "FRI", "SAT"};
        
        //a가 월 b가 일
        Calendar date = Calendar.getInstance();
        date.set(2016, a - 1, b);
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        
        return week[dayOfWeek];

        
        
    }
}