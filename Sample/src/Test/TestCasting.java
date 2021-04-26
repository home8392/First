package Test;

public class TestCasting {

	public static void main(String[] args) {
		// 강제 형변환
		long longVal = 100L;
		
		// 확인
		System.out.println("8byte형태의 " + longVal);
		
		int intVal = (int)longVal;	// 8바이트짜리 100이 4 바이트짜리 100으로 변환됨
		// 변환 확인
		System.out.println("4byte형태의 " + intVal);
		
		double dValue = 123.5;
		int iValue = (int)dValue;	// 8바이트 실수형 값이 4바이트 정수형 값으로 변환됨
				
		System.out.println(dValue + " -> " + iValue);
	}

}
