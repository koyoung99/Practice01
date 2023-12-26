package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("500원의 개수 : ");
		int count_500 = sc.nextInt();

		System.out.print("100원의 개수 : ");
		int count_100 = sc.nextInt();

		System.out.print("50원의 개수 : ");
		int count_50 = sc.nextInt();

		System.out.print("10원의 개수 : ");
		int count_10 = sc.nextInt();

		System.out.println("동전의 총합은 " + 
						(count_10 * 10 + count_100 * 100 + count_50 * 50 + count_500 * 500) + 
						" 원 입니다.");

	}

}
