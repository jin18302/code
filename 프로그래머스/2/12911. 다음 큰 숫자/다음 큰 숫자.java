class Solution {
    public int solution(int n) {
        
        //n을 2진수로 나누었을때의 1의 개수를 구해 변수에 저장해둔다
        //n부터 반복문을 통해 숫자를 2진수로 변환한다음 1의개수를 센다 
        //1의 개수가 같다면 값을 반환한다.
        
        long nTemp = Integer.bitCount(n);
        int m = n + 1;
        int result;
        
        while (true){
            
            if(nTemp == Integer.bitCount(m)){
                result = m;
                break;
            }
            m++;
        }
        return result;
        
    }
}