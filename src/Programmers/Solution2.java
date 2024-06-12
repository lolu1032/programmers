package Programmers;

import java.util.Scanner;

public class Solution2 {
//	첫번째로 푼 방법
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();

		int b_square = c*c - a *a;

		System.out.println(b_square);
	}
//	Math.pow는 거듭제곱을 한다. Math.pow() double형을 받는다 근데 a,b가 int 형이기때문에 앞에 int를 붙여
//	형변화를 해줬다.
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int c = sc.nextInt();
//
//		int b_square = (int)Math.pow(c, 2) - (int)Math.pow(a, 2);
//
//		System.out.println(b_square);
//	}
}
