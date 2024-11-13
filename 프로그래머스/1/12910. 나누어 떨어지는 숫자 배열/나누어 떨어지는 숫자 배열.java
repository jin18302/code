import java.util.*;


class Solution {
        public int[] solution(int[] arr, int divisor) {
            List<Integer> list= new ArrayList<>();
            int n=0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]%divisor==0){
                    list.add(arr[i]);
                }
            }

            if(list.isEmpty()){
                list.add(-1);
            }

            Collections.sort(list);
            int[]arr2=list.stream().mapToInt(Integer::intValue).toArray();
            return arr2;
        }

    }