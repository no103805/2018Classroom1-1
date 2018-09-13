package 종합실습과제;

import java.util.Scanner;

public class 문제07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\r|\n|,");
		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		System.out.printf("a AND b:%d\n", +(a & b));
		System.out.printf("a OR b:%d\n", +(a | b));
		System.out.printf("NOT a:%d\n", +(~a));
		System.out.printf("a Xor b:%d\n", +(a ^ b));
		System.out.printf("a NAND b:%d\n", +~(a & b));
		System.out.printf("a NOR b:%d\n", +~(a | b));

	}

}
