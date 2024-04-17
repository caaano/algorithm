class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int BigValue = Math.max(sides[0], sides[1]);
        int SmallValue = Math.min(sides[0], sides[1]);
        
        int hight = BigValue + SmallValue;
        int low = BigValue - SmallValue;
        
        answer = hight - low - 1;
        return answer;
    }
}