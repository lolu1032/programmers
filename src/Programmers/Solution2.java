package Programmers;

import java.util.Scanner;

public class Solution2 {
//	ù��°�� Ǭ ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();

		int b_square = c*c - a *a;

		System.out.println(b_square);
	}
//	Math.pow�� �ŵ������� �Ѵ�. Math.pow() double���� �޴´� �ٵ� a,b�� int ���̱⶧���� �տ� int�� �ٿ�
//	����ȭ�� �����.
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
