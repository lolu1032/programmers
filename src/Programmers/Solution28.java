package Programmers;

import java.util.Scanner;

public class Solution28 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(eq.equals("=") && ineq.equals(">") && n >= m) {
            answer = 1;
        }else if(eq.equals("=") && ineq.equals("<") && n <= m) {
            answer = 1;
        }else if(eq.equals("!")&& ineq.equals(">") && n >= m){
            answer = 1;
        }else if(eq.equals("!")&& ineq.equals("<") && n <= m) {
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }
}
