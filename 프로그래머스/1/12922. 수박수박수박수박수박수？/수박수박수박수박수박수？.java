class Solution {
    public String solution(int n) {
         String s = "";
        int repeat = n/2;
        for(int i=0;i<repeat;i++)
            s+="수박";
        
         if(n%2!=0)
            s+="수";
             
             return s;
        
        }
    }