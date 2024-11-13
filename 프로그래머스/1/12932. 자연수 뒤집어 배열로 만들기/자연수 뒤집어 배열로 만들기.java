class Solution {
    public int[] solution(long n) {
        String tmp=n+"";
        int len = tmp.length();
        int[] arr =new int[len];
        
        for(int i=0;i<len;i++){
            arr[i]=(int)(n%10);
            
            n/=10;
        }
        return arr;
    }
}