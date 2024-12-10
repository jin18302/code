class Solution {
    public long solution(long price, long money, int count) {
        long sum = 0;
        long num = 0;
        
        while (num <= count) {
            long total = price * num;
            sum+=total;
            num++;
        }
        if(sum<=money) return 0;
        return Math.abs(money-sum);
    }
}