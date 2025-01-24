import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
       long count = Arrays.stream(array).filter(value -> value > height).count();
        
        return (int)count;
    }
}