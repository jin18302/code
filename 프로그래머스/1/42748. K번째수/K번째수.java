import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {      
        int[]value = new int[commands.length];
       
        for(int n = 0 ; n < commands.length ; n++){
          int i = commands[n][0] - 1;
          int j = commands[n][1] - 1;
          int k = commands[n][2] - 1;
            
            int[] tempArr = new int[(j - i) + 1];
            System.arraycopy(array, i, tempArr, 0 , (j - i) + 1);
            
            Arrays.sort(tempArr);
            
            value[n] = tempArr[k];
    }
        return value;
}
}