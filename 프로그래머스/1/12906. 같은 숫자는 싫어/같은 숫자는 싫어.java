import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack();

        stack.add(arr[0]);

        for ( int i = 1; i < arr.length; i++){

            if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }
        LinkedList<Integer> linkedList = new LinkedList(stack);
        
        return linkedList.stream().mapToInt(n -> n).toArray();
    }
}