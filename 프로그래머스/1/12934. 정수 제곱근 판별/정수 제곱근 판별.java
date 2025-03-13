import java.lang.Math.*;

public class Solution {

    public static long solution(long n) {

        double result = Math.sqrt(n);

        if (result % 1.0 == 0.0) {
            return (long) Math.pow(result + 1, 2);
        }
        return -1;
    }
}