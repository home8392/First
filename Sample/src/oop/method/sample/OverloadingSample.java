package oop.method.sample;

public class OverloadingSample {
	public void out() {
		System.out.println("out() 메소드 실행!");
	}
	// 메소드 이름은 같고 매개변수가 다르다. 오버로딩
	public void out(int num) {	
		System.out.println("out(" + num + ") 메소드 실행!");
	}
}
