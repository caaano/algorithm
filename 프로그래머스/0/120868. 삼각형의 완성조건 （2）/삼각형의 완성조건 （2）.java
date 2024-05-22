class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int big = Math.max(sides[0], sides[1]);
        int small = Math.min(sides[0], sides[1]);
        
        int high = big + small;
        int low = big - small;
        
        answer = high - low - 1;
        return answer;
    }
}