package Programmers;

import java.util.Scanner;

public class Solution32 {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String oddNum = "";
        for(int i : num_list) {
            if(i % 2 == 0) {
                even+=i;
            }else {
                oddNum+=i;
            }
        }
        answer = Integer.parseInt(even)+Integer.parseInt(oddNum);
        return answer;
    }
}
