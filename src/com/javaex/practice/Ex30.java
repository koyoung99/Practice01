package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		final double KM = 1.609;

		Scanner sc = new Scanner(System.in);

		System.out.print("마일을 입력하세요 : ");

		double mile = sc.nextDouble();

		double km_ex_mile = KM * mile;

		System.out.println(mile + "마일은 " + km_ex_mile + "킬로미터 입니다.");

	}

}
