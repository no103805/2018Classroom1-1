package 종합실습과제;

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();
		System.out.printf("%.2f",(float)(c * 1.8) + 32);

	}

}
