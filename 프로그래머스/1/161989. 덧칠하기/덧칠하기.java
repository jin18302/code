class Solution {
    public int solution(int n, int m, int[] section) { 
        
        int[] wall = new int[n];
        int count = 0 ;
        
        for(int i = 0 ; i < section.length ; i++){
            wall[section[i] - 1] = 1 ;
        }// 칠해야하는 곳을 1로 표시해둔다
        
    int index = 0 ;
// 만약에 index + m 이 wall의 길이보다 크거나 같으면 count++하고 반환한다
        
     while(index < wall.length){
         if(wall[index] == 1){
             if (index + m >= wall.length){return ++count;}
             index += m;
             count++;
         }else{index++;}
     }
        return count;
    }
}