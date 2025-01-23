class Solution {
    public String solution(String s) {
       StringBuffer buffer = new StringBuffer(s);
        char temp = ' ';
        int index = 0;

        for(int i = 0; i < s.length(); i++){

            if(buffer.charAt(i) == ' '){
                index = 0;
                continue;
            }

            if(index % 2 == 0){
                temp = Character.toUpperCase(buffer.charAt(i));
            }

            if(index % 2 != 0){
                temp = Character.toLowerCase(buffer.charAt(i));
            }

            buffer.setCharAt(i, temp);
            index++;
        }
        return new String(buffer);
    }
}