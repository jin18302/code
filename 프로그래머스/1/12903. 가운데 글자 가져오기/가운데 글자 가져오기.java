class Solution {
   public String solution(String s) {
               int index=0;
               String answer;
               if(s.length()%2==0){//길이가 짝수이면
                    index=s.length()/2-1;
                    answer = s.substring(index,index+2);
               }else{
                   index=s.length()/2;
                  answer= ""+s.charAt(index);
               }
               return answer;
   }
}