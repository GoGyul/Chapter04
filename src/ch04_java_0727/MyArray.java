package ch04_java_0727;

public class MyArray <T> {

	T element; // T는 타입 변수 
	void setElement(T element) {this.element = element;}
	T getElement() {
		return element;
		}
	//		실제 타입 선언 ex) = <Integer>
	MyArray<Integer> myArr = new MyArray<Integer>();
	
	
}
