package 종합실습과제;

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = (a + b) / 2;

		System.out.printf("%d %d\n", a, b);
		if (a >= 40 && b >= 40 && c >= 60) {
			System.out.printf("합격");
		} else {
			System.out.printf("불합격(과락)");
		}
	}

}
