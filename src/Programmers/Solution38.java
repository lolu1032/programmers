import java.util.ArrayList;
import java.util.Arrays;

class Solution38 {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 1; k*i <= n; i++) {
            answer.add(k*i);
        }
        return answer;
    }
}