class Solution {
    public int solution(int[] numbers) {
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        
        int ssum=0;
        for(int i=0;i<10;i++){
            ssum+=i;
        }
            
        return ssum-sum;
    }
}