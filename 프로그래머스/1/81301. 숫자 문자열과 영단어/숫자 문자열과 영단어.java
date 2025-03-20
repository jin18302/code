import java.lang.*;

class Solution {
    public int solution(String s) {
       String[] strArr = 
           new String[]{"zero", "one", "two", "three", "four", "five", 
                        "six", "seven","eight", "nine", "ten"};
        
        for(int i = 0 ; i < strArr.length ; i ++){
                s = s.replace(strArr[i], i + "");
        }
            return Integer.parseInt(s);
    }
}