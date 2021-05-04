package Test;

public class TestArrayCopy {

	public static void main(String[] args) {
		String originArr[] = {"Apple", "Banana", "Orange"};
		String destArr[] = new String [originArr.length];

		/* src : 원본 배열		srcPos : 원본 배열 시작 인덱스
		 * dest : 복사할 배열	destPos : 복사할 배열 시작 인덱스
		 * length : 복사할 길이
			System.arraycopy(src, srcPos, dest, destPos, length);
		*/
		System.arraycopy(originArr, 0, destArr, 0, originArr.length);
		
		for(int i = 0; i < destArr.length; i++) {
			System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		}
	}

}
