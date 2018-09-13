package 종합실습과제;

import java.util.Scanner;

public class 문제05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		System.out.printf("%02d %02d %02d", s / 3600, s / 60 % 60, s % 60);

	}

}
