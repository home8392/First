package test;

public class TestDupFor {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {		// 2 ~ 9 까지 열 반복
			for(int j = 1; j <= 9; j++) {	// 1 ~ 9 까지 행 반복
				//\t : 탭키를 눌렀을 때랑 효과가 동일하다. 정렬하는데 사용
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");	
			}
			System.out.println();	// 열 바꿈
		}
	}
}
