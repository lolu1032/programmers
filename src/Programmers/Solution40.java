import java.util.ArrayList;
import java.util.Arrays;

class Solution40 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer+=my_string.charAt(i);
        }
        return answer;
    }
}