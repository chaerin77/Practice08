package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	//System.out.print(">>");
    	//String num = sc.nextLine();
    	/*
    	nArray[0]=num;
    	nArray[1]=num;
    	nArray[2]=num;*/
    	
    	//String[] nArray = num.split(" ");//num을 공백으로 쪼개서 배열에 넣기
    	
    	Add a = new Add();
    	Sub s = new Sub();
    	Mul m = new Mul();
    	Div d = new Div();
    	
    while(true) {	
    	System.out.print(">>");//반복될 형식들
    	String num = sc.nextLine();
    	String[] nArray = num.split(" ");
    	
    	
    	//for(int i=0; i<nArray.length; i++) {
    	
	    	if(nArray[1].equals("+")) {//배열안의 값과 입력될 값이 같은지 비교
	    		a.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2])); //chapter03 ex07 wrapperApp-문자열을 숫자로 바꾸기
	    		System.out.println(">>" + a.calculate());
	    		
	    	}else if(nArray[1].equals("-")) {
	    		s.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
	    	    System.out.println(">>" + s.calculate());
	    	    
	    	}else if(nArray[1].equals("*")) {
	    		m.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
	    	    System.out.println(">>" + m.calculate());
	    	    
	    	}else if(nArray[1].equals("/")) {
	    		d.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
	    	    System.out.println(">>" + d.calculate());
	    	    
	    	}else if(nArray[1].equals("&")) {
	    		System.out.println("알 수 없는 연산입니다.");
	    		
	    	}else if(nArray[1].equals("/q")) {
	    		System.out.println("종료합니다.");
	    		break;
	    	}else {
	    		System.out.println("알 수 없는 연산입니다.");
	    	}
    	//}
    }
    	
    	/*
    	int a=sc.nextInt();
    	String b=sc.nextLine();
    	
    	nArray[0]=a;
    	nArray[1]=b;
    	nArray[2]=a;*/
    	
    	
    }
}
