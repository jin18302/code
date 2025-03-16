import java.util.*;
import java.lang.*;

class Solution {
      public int solution(int[][] sizes) {
        List<Integer> n = new ArrayList<>();
        List<Integer> m = new ArrayList<>();

        //가로와 세로 길이중에 더 큰것을 왼쪽에 두고, 작은 것은 오른쪽에 둔다
        //왼쪽수 중에 가장 큰 값을 뽑고, 오른쪽 수중에 가장 큰 값을 뽑는다
        //두 수를 곱한 값을 반환한다

        for(int i = 0 ; i < sizes.length ; i++){
            n.add(Math.max(sizes[i][0], sizes[i][1]));
            m.add(Math.min(sizes[i][0], sizes[i][1]));
        }
        return Collections.max(n) * Collections.max(m);
    }
}