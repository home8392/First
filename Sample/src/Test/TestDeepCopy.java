package Test;

public class TestDeepCopy {

	public static void main(String[] args) {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[];
		
		// 원본 배열이랑 길이 같게 설정
		destArr = new String [originArr.length];
		
		// for문을 이용하여 별도의 배열공간에 하나씩 복사한다.
		for(int i = 0; i < originArr.length; i++) {
			destArr[i] = originArr[i];
		}
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		}
	}
}
