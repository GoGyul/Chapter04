package ch04_java_0727;

public class MyArray <T> {

	T element; // T�� Ÿ�� ���� 
	void setElement(T element) {this.element = element;}
	T getElement() {
		return element;
		}
	//		���� Ÿ�� ���� ex) = <Integer>
	MyArray<Integer> myArr = new MyArray<Integer>();
	
	
}
