package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로 : ");
		double width = sc.nextDouble();

		System.out.print("세로 : ");
		double hegiht = sc.nextDouble();

		double area = width * hegiht * 0.5;

		System.out.println("삼각형의 넓이는 " + area + " 입니다.");

	}

}
