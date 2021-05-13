package test;

public class TestAssign {
	
	public static void main(String[] args){
		int i = 1;
		
		// 대입 연산자
		i += 2;
		System.out.println("i += 2 -> i = " + i);
		
		i -= 2;
		System.out.println("i = 3, i -= 2 -> i = " + i);
		
		i *= 2;
		System.out.println("i = 1, i *= 2 -> i = " + i);
		
		i /= 2;
		System.out.println("i = 2, i /= 2 -> i = " + i);
		
		// % 는 뒤 숫자로 나누고 난 나머지를 뜻한다.
		i %= 2;
		System.out.println("i = 1, i %= 2 -> i = " + i);
		
		// 삼항 연산자
		int value = 123;
		String result = (value % 2 == 0)? "짝수" : "홀수";
		System.out.println(value + "는 " + result + "이다.");
	}
}
