import java.util.*;

class Solution {
    public String solution(int age) {
        // '0'부터 '9'까지의 숫자에 대응하는 문자열을 배열에 저장
        String[] mappings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        
        String answer = "";
        String s = String.valueOf(age);
        String[] arr = s.split("");
        
        for(int i = 0; i < arr.length; i++){
            // 각 숫자에 대응하는 문자열을 배열에서 가져와서 결과 문자열에 추가
            answer += mappings[Integer.parseInt(arr[i])];
        }
        
        return answer;
    }
}
