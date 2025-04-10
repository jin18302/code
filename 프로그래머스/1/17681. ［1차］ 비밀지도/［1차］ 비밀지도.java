class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] result = new String[n];

    for (int i = 0; i < n; i++) {
        // OR 연산 결과
        int orResult = arr1[i] | arr2[i];

        // n자리 이진수로 포맷 후 치환
        String binary = String.format("%" + n + "s", Integer.toBinaryString(orResult))
                             .replace(' ', '0')
                             .replace('1', '#')
                             .replace('0', ' ');

        result[i] = binary;
    }

    return result;
}
}