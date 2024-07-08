import java.util.Arrays;

class Solution37 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int j = 0;
        for(int i = start_num; i <= end_num; i++,j++) {
            answer[j] = i;
        }
        return answer;
    }
}