class Solution {
    public int[] solution(int brown, int yellow) {
        
        int yellowX;
        int yellowY;
        
    
    for(int i = 1 ; i <= yellow ; i++){
        
        if(yellow % i == 0){
             yellowX = i;
             yellowY = yellow/i;
            
            if((yellowX * 2) + (yellowY * 2) + 4 == brown){
                
                int x = Math.max(yellowX +2, yellowY+2);
                int y = Math.min(yellowX +2, yellowY+2);
                
                return new int[]{x, y};
            }
        }
    }
        return null;
     
}
}