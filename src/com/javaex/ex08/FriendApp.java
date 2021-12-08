package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		System.out.println("친구를 3명 등록해 주세요");
		Scanner sc = new Scanner(System.in);
		Friend[] fArray = new Friend[3];//Friend객체를 넣어줄 Friend배열 만들기
		//String[] friend = new String[3];
		//String[] fArray = friend.split(" ");

		for(int i=0; i<fArray.length; i++){
			String info=sc.nextLine();
			String sArray[]=info.split(" ");
			fArray[i]= new Friend(sArray[0],sArray[1],sArray[2]);
		}

		fArray[0].showInfo(); 
		fArray[1].showInfo(); 
		fArray[2].showInfo(); 
		
		/*
		String Woo = sc.nextLine();
		String[] wArray = Woo.split(" ");
		
		String Lee = sc.nextLine();
		String[] iArray = Lee.split(" ");
		
		String Jae = sc.nextLine();
		String[] jArray = Jae.split(" ");
		
		Friend W = new Friend(wArray[0],wArray[1],wArray[2]);
		
	    Friend L = new Friend(iArray[0],iArray[1],iArray[2]);
	
	    Friend J = new Friend(jArray[0],jArray[1],jArray[2]);
	
	    W.showInfo();
	    L.showInfo();
	    J.showInfo();
	    */
		/*
	    Friend f = new Friend();
	    Friend f1;
	    f1 = new Friend();
	    */
	}

}
