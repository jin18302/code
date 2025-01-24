class Solution {
    public double solution(int[] numbers) {
      double sum = 0;
        double result = 0.0;
        
        for(int i : numbers){
            sum += i;
        }
        
        result = sum / numbers.length;
        
        return result;
    }
}