package test;

public class TestSign {

	public static void main(String[] args) {
		int value = -57;
		
		int result1 = +value;
		int result2 = -value;
		
		System.out.println("value : " + value);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int x = 12;
		int y = 12;
		
		// ++가 앞에 붙으면 값을 1 증가 시킨 후 대입
		System.out.println("x: " + x);
		int result3 = ++x ;
		System.out.println("x: " + x + ", result3 = " + result3);
		
		// ++가 뒤에 붙으면 값을 대입 시킨 후 1 증가
		System.out.println("y: " + y);
		int result4 = y++;
		System.out.println("y: " + y + ", result4 = " + result4);
				
	}

}
