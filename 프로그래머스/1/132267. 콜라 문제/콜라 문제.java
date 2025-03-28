class Solution {
    public int solution(int a, int b, int n) {
        int count = 0;

        while (n >= a) {
            int give = n / a;
            int get = give * b;
            int remain = n % a;

            count += get;
            n = get + remain;
        }

        return count;
    }
}
