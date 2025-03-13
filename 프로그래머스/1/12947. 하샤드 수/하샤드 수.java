class Solution {
    
        public boolean solution(int x) {
            int j = 0;
            int a = x;

            for(int i = 0 ; i < x + "".length() ; i++){
                j += (a % 10);
                a /= 10;
            }
            if(x % j == 0) {return true;}

            return false;
        }
}