package Programmers;

import java.util.Scanner;

public class Solution30 {
	 public int solution(int a, int d, boolean[] included) {
	        int answer = 0;
	        int result = a;
	        for(int i = 0; i < included.length; i++) {
	            if(included[i] == true) {
	                if(i == 0) {
	                    answer+=a;
	                }else {
	                    result+=d;
	                    answer+=result;   
	                }
	            }else {
	                if(i == 0) {
	                    result = a;
	                }else {
	                    result+=d;   
	                }
	            }
	        }
	        return answer;
	    }
}
