package test;

public class TestWhile {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {	// while(조건식) 이 참(true)일 경우 실행되는 문장들
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지 정수들의 합 : " + sum);
	}

}
