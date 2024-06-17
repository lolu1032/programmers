package Programmers;

import java.util.Scanner;

public class Solution19 {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++) {
            answer += Character.toString(str1.charAt(i)).concat(Character.toString(str2.charAt(i)));
        }
        return answer;
    }
}
