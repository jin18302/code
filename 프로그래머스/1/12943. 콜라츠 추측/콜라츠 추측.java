class Solution {
    public int solution(int num) {
        
        if(num == 1)return 0;
        
        long value = num;
        int count = 1;
        
        while(count != 500){
            
           value = value %2 == 0 ? value/2 : (value * 3)+1; 
            
            if(value == 1){return count;}
            count ++;
        }
        return -1;
    }
}