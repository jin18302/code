class Solution {
    public String solution(String phone_number) {
       char[] number = phone_number.toCharArray();

            for(int i=number.length-1-4;i>=0;i--){
                number[i]='*';
            }

            return new String(number);
    }
}