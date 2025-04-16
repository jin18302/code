import java.util.* ; 

class Solution {
    public int solution(int k, int m, int[] score) {
        
        int box = score.length / m ;
        int maxProfit = 0 ;
        int[]temp = new int[m];
        
        Arrays.sort(score);
        
        for(int i = score.length - 1  ; i >= (m - 1) ; i -= m){
            
            System.arraycopy(score, i - (m - 1), temp, 0, m);
            int minScore = Arrays.stream(temp).min().getAsInt();
            
            maxProfit += minScore * m ;
        }
        return maxProfit ;
    }
}