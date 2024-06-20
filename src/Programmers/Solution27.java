package Programmers;

import java.util.Scanner;

public class Solution27 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        answer = flag ? a + b : a-b;
        return answer;
    }
}
