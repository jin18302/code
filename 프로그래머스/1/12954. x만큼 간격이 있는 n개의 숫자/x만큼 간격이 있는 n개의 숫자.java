class Solution {
    public long[] solution(int x, int n) {
        
        long result=x;
        long[] answer = new long[Math.abs(n)];
       for(int i=0;i<answer.length;i++){
           answer[i]=result;
           result+=x;
           
       }
        return answer;
    }
}