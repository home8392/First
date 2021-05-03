package Test;

public class TestMultiBreak {

	public static void main(String[] args) {
		label: for( ; ; ) {
			for(int i = 0; i <10; i++) {
				System.out.println(i);
				if(i == 5) 
					break label;	// i 값이 5가 되면 반복문 종료
				// 한 번에 여러 단계의 중첩 반복문을 빠져나가는 label을 이용 
			}
		}
		
		Outter: for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.println("중첩 loop 동작 중 i : " + i + " j : " + j);
				
				if( i == 2) {
					break Outter;
				}
			}
		}
	}

}
