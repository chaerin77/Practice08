package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		String[] sArray = numLine.split(" ");//문자열 공백으로 구분하기
		for(int i=0; i<sArray.length; i++) {
			sum=sum+Integer.parseInt(sArray[i]); //문자열 숫자로 바꿔주기
		}
		//Integer.parseInt(numLine)썼었음 ,for문 쓸 생각 못함. 배열에 담는다는걸 의식하기
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
