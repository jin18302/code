class Solution {
    public int[] solution(String s) {
        char[]chars = s.toCharArray();
         int[] answer = new int[chars.length];
        
    answer[0] = -1;
        
        for(int i = 1 ; i < chars.length ; i++){
            for(int j = (i - 1) ; j >= 0 ; j--){
                
                if(chars[i] == chars[j]){
                    // 만약에 이전 인덱스에 일치하는 문자가 있다면, 현재인덱스 - 이전 인덱스
                    answer[i] = i - j;
                    break;
                }
            }
            if(answer[i] == 0){answer[i] = -1;}
            
        }
        return answer;
    }
}