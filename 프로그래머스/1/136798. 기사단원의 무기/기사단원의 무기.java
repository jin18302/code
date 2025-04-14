class Solution {
    public int solution(int number, int limit, int power) {
        int[] result = new int[number];
        int total = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    result[i - 1]++;
                    if (j != i / j) result[i - 1]++;
                }
            }

            if (result[i - 1] > limit) {
                result[i - 1] = power;
            }

            total += result[i - 1];
        }

        return total;
    }
}
