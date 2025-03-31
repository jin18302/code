class Solution {
    public String solution(String s) {
       String[]strArr = s.toLowerCase().split("");
        boolean isBlank = true;
        String result = "";
        
        for( int i = 0 ; i < strArr.length ; i++ ){
           result += isBlank ? strArr[i].toUpperCase() : strArr[i];
            
            isBlank = strArr[i].equals(" ") ? true : false ;
        }
        return result ;
    }
}