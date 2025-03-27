import java.util.*;

class Solution {
    boolean solution(String s) {
       //*의사코드
        //문자열에서 한글자를 뽑아와 스택에 담는다
        //(이면 스택에 담고, )를 만나면 스택에서 맨 위에 거를 뺀다
        //문자열의 길이 만큼 반복
        //스택이 비어있으면 true, 비어 있지 않으면 false를 반환한다
        //가능한 최소 시간 복잡도 -> n log n
        
        Stack stack = new Stack();
        char temp = ' ';
        
        for(int i = 0 ; i < s.length() ; i ++){
            
            temp = s.charAt(i) ;
            
            if(stack.empty() && temp == ')'){return false ;}
            //스택이 비어있는데 ")"가 나온다면 짝이 맞지 않는것 임으로 무조건 false를 반환
            
            if(temp == '('){
                stack.push(temp);
            }else{
                stack.pop();
            }
        }
        return stack.empty();
    }
}