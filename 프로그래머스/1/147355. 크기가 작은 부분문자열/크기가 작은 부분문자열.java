class Solution {
    public int solution(String t, String p) {
        int tLength = t.length(); // 긴 문자열의 길이를 뽑는다
        int pLength = p.length(); // 짧은 문자열의 길이를 뽑는다
        int n = (tLength - pLength) + 1; // t의 길이 - p의 길이 + 1
        int count = 0;
        
        for(int i = 0 ; i < n ; i++){
           String value = t.substring(i, i + pLength);
            if(Long.parseLong(value, 10) <= Long.parseLong(p, 10)){
                count++;
            }
        }
        return count;
    }
}