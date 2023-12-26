package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("화씨 : ");

		int x = sc.nextInt();
		double y = 5 / 9.0 * (x - 32);

		System.out.println("화씨" + x + " 의 섭씨온도는 " + y + "입니다.");

	}

}
