package ch04_java_0727;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 100; i++) {
			 
			if(i%3 !=0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
		
//		int i = (int)(Math.random()*6)+1;
//		int i2 = (int)(Math.random()*6)+1;
//		int total = i + i2;
		int x = 0;
		while(x < 1) {
			int i = (int)(Math.random()*6)+1;
			int i2 = (int)(Math.random()*6)+1;
			
			System.out.println(i);
			System.out.println(i2);
			int total = i + i2;
			
			if(total != 5) {
				continue;
			} else {
				System.out.println("total" + total);
				break;
			}
		}
		
		
//		4x + 5y = 60
		
		
		for(int x1 = 1; x1 <10; x1++) {
			for(int y1=1; y1<10; y1++) {
				
			   int result = ((4*x1) + (5*y1)%60);
//			   System.out.println(result);
			   if(result==60) {
				   System.out.println("x1:"+ x1 + " y1:" + y1);
			   }
			}
		}
		
		
		
		
		
		int star =1;
		int line; 
		for(line = 1; line <=4; line++)  {
			for(int i=0; i < star; i++) {
			 System.out.print("*");
			}
			star += 1;
			System.out.println();
		}
		
		
		
		
		int line2 = 4;
		int star2 =1;
		int empty = 3;
		for(int l = 1; l<=line2; l++ ) {
			for(int e = 1; e <=empty; e++) {
				System.out.print(" ");		
			}
			for(int i =1; i <=line2-empty; i++ ) {
				System.out.print("*");
			}
			empty -=1;
			star2 +=1;
			System.out.println();
		}
		
		
		
		
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료.");
			System.out.println("---------------------");
			System.out.println("선택> ");
			String value = scn.nextLine();
			int input = Integer.parseInt(value);
			
			
			switch(input) {
			case 1:
				System.out.println("예금액>");
				String money = scn.nextLine();
				balance += Integer.parseInt(money);
				System.out.println("예금액>" + money);
				break;
			case 2:
				System.out.println("출금액>");
			 	String money2 =  scn.nextLine();
			 	balance += Integer.parseInt(money2);
			 	continue;
			case 4:
				run = false;
				break;
			}
			System.out.println("");
		}
		System.out.println("종료");
		
	}
}
