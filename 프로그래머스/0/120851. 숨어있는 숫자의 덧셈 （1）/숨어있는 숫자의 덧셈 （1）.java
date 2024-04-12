import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        
        String[] arr = my_string.split("");
        int[] num = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            num[i] = Integer.parseInt(arr[i]);
            answer += num[i];
        }
        
        return answer;
    }
}