package Programmers;

import java.util.Scanner;

public class Solution31 {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiplication = 1;
        int sumSquare = 0;
        for(int i = 0; i < num_list.length; i++) {
            sumSquare+=num_list[i];
            multiplication *= num_list[i];
        }
        if(multiplication < (int)Math.pow(sumSquare,2)) {
            answer = 1;
        }
        return answer;
    }
}
