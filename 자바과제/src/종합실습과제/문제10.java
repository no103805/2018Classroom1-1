package 종합실습과제;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		a=sc.nextLine();

		if (a.charAt(7) % 2 == 1) {
			System.out.println("성별:남자");
		} else {
			System.out.println("성별:여자");
		}
		sc.close();
	}
}
