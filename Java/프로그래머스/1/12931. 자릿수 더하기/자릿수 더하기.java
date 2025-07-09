import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(;;){
            if(n <= 0){
                break;
            }
            answer += n % 10;
            n /= 10;
        }
        System.out.println(answer);
        return answer;
    }
}