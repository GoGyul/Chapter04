package ch04_java_0727;

public class IsIt {

	
	
	
	
	public static void main(String[]args) {
		
// String ��ü�� ������ �ֵ��� �ּҰ��� �ٸ�.
// ������ ���ڿ� ���� ���ϰ� �������� equals() �޼��带 ����ϸ��.
		
		IsIt v1 = new IsIt();
		IsIt v2 = new IsIt();
		
		boolean v3 = v1==v2;
		
		System.out.println(v3);
		
		
		String st = new String("��");
		String st2 = new String("��");
		
		
		String str;
		str = "��";
		String name = "��";
		
		System.out.println(str==st2);
		
		
	}
	
}

