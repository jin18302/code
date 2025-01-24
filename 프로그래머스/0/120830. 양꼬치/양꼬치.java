class Solution {
    public int solution(int n, int k) {
       //n이 10이면 k를 -1한다
        int service = n/10;
        k -= service;
        
        int result = (n*12000)+(k*2000);
        
        return result;
    }
}