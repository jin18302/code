class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1Idx = 0 ;
        int c2Idx = 0 ;
       
        for(int i = 0 ; i < goal.length ; i++){// 5번 반복
            //문제점 -> 
            //지금 원하는 문자열 배열의 길이 만큼 반복하는데, 하나의 배열의 원소를 다사용해도 인덱스가 늘어난다
             boolean isEqual = false ;
            
            if(c1Idx < cards1.length && cards1[c1Idx].equals(goal[i])){
                c1Idx++;
                isEqual = true;
                 continue;
            }
            
            //여기에서도 비교를 하면안됨
            if(c2Idx < cards2.length && cards2[c2Idx].equals(goal[i])){
                c2Idx++;//2
                isEqual = true ;
                 continue;
            }
            
            if(isEqual == false){return "No";}
        }
        
        return "Yes";
    }
}