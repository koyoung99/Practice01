package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {

		final double WON = 1230.95;

		Scanner sc = new Scanner(System.in);

		System.out.print("환전할 원화를 입력하세요 :");

		double ex_won = sc.nextDouble();
		ex_won = ex_won / WON;

		System.out.println(ex_won);

	}

}
