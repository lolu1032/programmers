package Programmers;

import java.util.Scanner;

public class Solution26 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
           if(n % 2 == 0 && i % 2 ==0) {
               answer+=(int)Math.pow(i,2);
           }else if(n % 2 != 0 && i % 2 != 0) {
               answer+=i;
           }
        }

        return answer;
    }
}
