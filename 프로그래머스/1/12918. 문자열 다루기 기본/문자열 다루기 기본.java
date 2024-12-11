class Solution {
    public boolean solution(String s) {
       char temp = ' ';
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            result = temp - '0';
            if (result < 0 || result > 9) return false;
        }

        if(s.length()==4 || s.length() == 6){
            return true;
        }
        else
            return false;

    }
}