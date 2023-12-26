package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final double PI = 3.14;

		System.out.print("반지름 :");

		double r = sc.nextDouble();
		double v = 4 / 3.0 * PI * r * r * r;

		System.out.println("구의 부피는 : " + v + " 입니다.");

	}

}
