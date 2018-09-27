package 종합실습과제;

import java.util.Scanner;
public class 문제21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		int n=sc.nextInt();
		System.out.printf("자연수 n:%d",n);
		for(i=1; i<=n;i++)
		{
			sum+=i*i;
		}
		
		System.out.printf("결과:%d",sum);
	}

}
