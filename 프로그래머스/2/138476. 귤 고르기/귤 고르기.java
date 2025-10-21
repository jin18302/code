import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Solution {
   public int solution(int k, int[] tangerine) {
       
    int count = 0;
    Map<Integer, Long> freq =Arrays.stream(tangerine).boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                                               Collectors.counting()));

        long[] valueArr = freq.values().stream()
            .mapToLong(Long::longValue).toArray();
       
        Arrays.sort(valueArr);
        
        for(int i = valueArr.length - 1 ; i >= 0 ; i--){
            k -= (int) valueArr[i];
            count ++;
            
            if(k <= 0)break;
        }
        return count;
    }
}