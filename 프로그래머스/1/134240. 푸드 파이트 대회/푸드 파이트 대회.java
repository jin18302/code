import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(int[] food) {
        String result = "";
        LinkedList<Character> linkedList = new LinkedList<>();

        for (int i = 1; i < food.length; i++) {//배열의 길이만큼 반복한다
            if (food[i] % 2 != 0) {
                // 만약 인덱스[i]가 가지고 있는 값이 홀수이면 양수로 만들어준다
                food[i] -= 1;
            }
            for (int j = 0 ; j < food[i]; j++) {//인덱스[i]가 가지고있는 수만큼 반복한다
                linkedList.add(linkedList.size() / 2, (char) ((char) i + '0'));
            }
        }
        linkedList.add(linkedList.size() / 2, '0');
        
         return linkedList.stream()
                .map(String::valueOf) 
                .collect(Collectors.joining());
    }
}