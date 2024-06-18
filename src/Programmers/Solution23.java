package Programmers;

import java.util.Scanner;

public class Solution23 {
    public int solution(int a, int b) {
        int answer = 0;
        int result = 2 * a * b ;
        String str = Integer.toString(a) + Integer.toString(b);
        answer = Integer.parseInt(str);
        return answer > result ? answer : result > answer ? result : result == answer ? answer : 0;
    }
}
