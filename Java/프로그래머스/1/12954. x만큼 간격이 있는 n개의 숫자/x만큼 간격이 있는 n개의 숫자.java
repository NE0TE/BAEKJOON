class Solution {
    public long[] solution(int x, int n) {
        long a = x;
        long[] answer = new long[n];
        for(int i = 0; i < n; i++){
            answer[i] = a;
            a += x;
        }
        return answer;
    }
}