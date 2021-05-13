package access.sample;

public class Child extends Parent{
	public void insert() {
		num = 10;	// protected 멤버는 상속된 후손 내에서만 사용 가능함
	}
	public void out() {
//		System.out.println(num);
		System.out.println("자식 클래스 메소드");
	}
	@Override
	public void display() {
		System.out.println("상속받아 재정의한 메소드");
	}
}
