package ch04_java_0727;

public class IsIt {

	
	
	
	
	public static void main(String[]args) {
		
// String 객체로 생성된 애들은 주소값이 다름.
// 온전히 문자열 만을 비교하고 싶을때는 equals() 메서드를 사용하면됨.
		
		IsIt v1 = new IsIt();
		IsIt v2 = new IsIt();
		
		boolean v3 = v1==v2;
		
		System.out.println(v3);
		
		
		String st = new String("우");
		String st2 = new String("귤");
		
		
		String str;
		str = "귤";
		String name = "귤";
		
		System.out.println(str==st2);
		
		
	}
	
}

