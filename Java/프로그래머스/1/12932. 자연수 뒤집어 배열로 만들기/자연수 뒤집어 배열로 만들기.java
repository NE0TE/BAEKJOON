class Solution {
    public int[] solution(long n) {
        int[] answer = new int [12];
        for(int i = 0;;i++){
            if(n == 0){
                return java.util.Arrays.copyOf(answer, i);
            }
            answer[i] = (int)(n % 10);
            n /= 10;
        }
    }
}