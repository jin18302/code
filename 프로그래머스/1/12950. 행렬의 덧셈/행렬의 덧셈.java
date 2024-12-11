class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr1[1].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                int value1 = arr1[i][j];
                int value2 = arr2[i][j];
                arr[i][j] = value1 + value2;
            }
        }
        return arr;
    }
}