class Solution {
    public String solution(String[] seoul) {
        int index=0;
        while(true){
            
            if("Kim".equals(seoul[index]))
                break;
            
            index++;
        }
            return "김서방은 "+index+"에 있다";
        }
    }