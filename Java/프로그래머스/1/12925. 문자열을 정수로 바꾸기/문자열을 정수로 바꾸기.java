class Solution {
    public int solution(String s) {
        int answer = 0;
        int j = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '-'){
                answer = -answer;
                continue;
            }
            else if (s.charAt(i)=='+'){
                continue;
            }
            answer += (s.charAt(i) - '0') * j;
            j *= 10;
        }
        return answer;
    }
}