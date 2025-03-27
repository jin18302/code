class Solution {
    public String solution(String s) {
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        int temp = 0;
        String[] strArr = s.split("\\s+");
        
      for(int i = 0 ; i < strArr.length ; i++){
          temp = Integer.parseInt(strArr[i]);
          
            if(temp < min){min = temp ;}
            if(temp > max){max = temp ;}
        }
        
        return min + " " + max ;
    }
}