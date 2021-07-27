package ch04_java_0727;

public class IfExample {

	public static void main(String[] args) {
		String grade;
		int score = -1;
		if(score >= 90) {
			grade = "A";
		} else if  (score >= 80) {
			grade = "b";
		}else {
			grade = "c";
		}
		System.out.println(grade);
		
		
		
		switch(score) {
		case 90:
			System.out.println("A");
			break;
		case 60:
			System.out.println("C");
			break;
		}
		
		
		
		double i = (Math.random())+10;
		int x = 13;
		double z = i*45;
		System.out.println(i);
		System.out.println(z);
		
		
		
		
		int num1 = (int)(Math.random()*6)+1;
		System.out.println(num1);
		
		
		switch(num1) {
		case 1:
			System.out.println("1임");
			break;
		case 2:
			System.out.println("2임");
			break;
		case 3:
			System.out.println("3임");
			break;
		case 4:
			System.out.println("4임");
			break;
		case 5:
			System.out.println("5임");
			break;
		case 6:
			System.out.println("6임");
			break;
		}
		
		
		
		int month = 1;
		
		switch(month) { // month에 12를 대입하면 break를 만나기전까지는 계속 실행,
		
		case 12:
		case 1:
		case 2:
			System.out.println("봄.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("여름.");
			break;
		}
		
		
		
		char cus = '2';
		
		switch(cus) {
		
		case 'A':
		case 'B':
		case 'C':
			System.out.println("굿.");
			break;
		case 'D':
		case 'E':
		case 'F':
			System.out.println("구");
			break;
			
			default :
			System.out.println("가입 ㄱㄱ.");
		}
		
	}
	
}
