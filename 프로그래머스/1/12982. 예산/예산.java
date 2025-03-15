import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        //작은 수부터 정렬한다
        //기존의 값에서 작은 수부터 뺀다 
        //카운트를 늘린다
        //다음값이 예산보다 작으면 중지하고 카운트를 반환한다

        int count = 0;
        
        Arrays.sort(d);
        
        for(int i = 0 ; i < d.length ; i++){
            if(d[i] <= budget){
                budget -= d[i];
                count++;
            }else{break;}
        }
        return count;
    }
}