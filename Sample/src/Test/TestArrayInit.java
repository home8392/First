package Test;

public class TestArrayInit {

	public static void main(String[] args) {
		//	String[] strArr = new String[3];
		String strArr[] = {"Apple", "Banana", "Orange"};
		
		System.out.println("배열의 길이는 " + strArr.length + "입니다");
	
		for(int i = 0; i < strArr.length; i++) {
			// 배열 출력
			System.out.println(strArr[i]);	
		}
		System.out.println("---------------------------");

		String destArr[];		// 배열의 주소 복사용 배열래퍼런스 선언
		
		destArr = strArr;	// 주소 복사
		
		for(int i= 0; i < 3; i++) {
			System.out.println(strArr[i] + " : " + destArr[i]);
		}
		System.out.println("---------------------------");
			strArr[1] = "Pineapple";	// 원본 배열 2번째 인덱스의 값 수정

		for(int i= 0; i < 3; i++) {
			System.out.println(strArr[i] + " : " + destArr[i]);
		}
	}
}
