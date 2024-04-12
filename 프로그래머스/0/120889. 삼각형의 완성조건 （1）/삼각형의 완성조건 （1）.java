import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        for(int i = 0; i < sides.length; i++){
            if(sides[sides.length - 1] >= sides[0] + sides[1]){
                answer = 2;
            }
            else{
                answer = 1;
            }
        }
        
        return answer;
    }
}