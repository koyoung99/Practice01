package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("상품가격 : ");
		double price = sc.nextDouble();

		System.out.print("받은돈 : ");
		double re_money = sc.nextDouble();

		double vat = price * 0.1;
		System.out.println("==================");

		System.out.println("받은돈 : " + re_money);
		System.out.println("상품가격 : " + price);
		System.out.println("부가세 : " + vat);
		System.out.println("잔액 : " + (re_money - price));

	}

}
