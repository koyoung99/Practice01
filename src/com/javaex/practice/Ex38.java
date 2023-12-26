package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("전체금액을 입력해주세요 : ");

		int price = sc.nextInt();

		int r_price = price - price % 1000;

		System.out.println("실제금액은 " + r_price + " 입니다.");

	}

}
