package ch04_java_0727;

public class ForWhileEx {

	public static void main(String[] args) {

		int sum = 0;;
		int i = 1;
		
		while(i<10) {
			sum += i;
			i++;
		}
//		System.out.println(sum);

		

		for(int i2 = 1; i2 <10; i2++) {
			if(i2%2!=0) {
				continue;
			}
			System.out.println(i2);	
		}
		
		
		
// ��ø for������ � ������ ����Ͽ� break�� ���� ��� for���� ���������.
		Out: for(char upper= 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(upper == 'B') {
					break Out;
				}
			}
			System.out.println("����.");
		}
		
	}

}
