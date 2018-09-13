package 종합실습과제;

import java.io.PrintStream;
import java.util.Scanner;

public class 문제15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.printf("프로점수:%d\n", a);
		int b;
		b=a/10;
		
		switch (b) {
		case 10:
		case 9:
			System.out.print("A");
			break;
		case 8:
			System.out.print("B");
			break;
		case 7:
			System.out.print("C");
			break;
		case 6:
			System.out.print("D");
			break;
		case 5:
			System.out.print("E");
			break;

		}

		System.out.printf("등급:%s", b);
	}

}
