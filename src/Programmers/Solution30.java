package Programmers;

import java.util.Scanner;

public class Solution30 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a+b+c;
        int sum2 = (int)Math.pow(a,2)+(int)Math.pow(b,2)+(int)Math.pow(c,2);
        int sum3 = (int)Math.pow(a,3)+(int)Math.pow(b,3)+(int)Math.pow(c,3);
        if(a == b && b == c) {
            answer = sum *sum2 * sum3;
        }else if(a==b && b != c || b == c && a != c || a == c && c!=b) {
            answer = sum * sum2;
        }else{
            answer = sum;
        }
        return answer;
    }
}
