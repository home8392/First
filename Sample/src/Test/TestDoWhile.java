package Test;

import java.util.Scanner;

public class TestDoWhile {

	public static void main(String[] args) {
			int value = 0, sum = 0;
			Scanner in = new Scanner(System.in);
			
			do {
				System.out.print("정수 숫자를 입력하세요 (종료는 : 99) : ");
				value = in.nextInt();
				sum += value;
			} while(value != 99);	// 루프 마지막에 조건을 비교하여 반복여부를 결정한다.
			
			System.out.println("입력된 정수 값들의 합계 : " +(sum - 99));
			System.out.println("프로그램 종료");
	}

}
