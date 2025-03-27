import java.util.*;

class Solution{
    public int solution(int []a, int []b){
        int result = 0 ;
        int aIdx = 0 ;
        int bIdx = a.length - 1 ;
        
      Arrays.sort(a);
      Arrays.sort(b);
        
        while(bIdx >= 0){
            result += a[aIdx++] * b[bIdx--];
            
        }
        
        
        return result;
    }
}