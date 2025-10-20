import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] people, int limit) {
        
       Arrays.sort(people);       

        int count = 0;
        int startIdx = 0;
        int lastIdx = people.length - 1;

        while (startIdx <= lastIdx) {
            int remaining = limit;

            remaining -= people[lastIdx];
            lastIdx--;

    
            if (startIdx <= lastIdx && people[startIdx] <= remaining) {
                startIdx++;
            }

            count++; // 보트 1척 출발
        }
        return count;
    }
}
