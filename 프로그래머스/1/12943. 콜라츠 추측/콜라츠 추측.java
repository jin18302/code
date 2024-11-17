class Solution {
    public int solution(int num) {
    long n=num;
      if (n==1)return 0;
        int count=1;
        
        
           while(count<=500){
                if(n%2==0) n/=2;
                else n=n*3+1;

                if (n==1)return count;
               else count++;
            }
            return -1;
    }
}