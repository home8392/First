package test;

public class TestSwitch {

	public static void main(String[] args) {
		int score = 89;
		char grade =   ' ';
		
		switch(score/10) {
		case 10 :						// switch(조건식)의 결과 값이 case 값과 같을 경우 수행되는 문장
		case 9 :	grade = 'A';
					break;
		case 8 :	grade = 'B';
					break;
		case 7 :	grade = 'C';
					break;
		default :	grade = 'F'; 
		}
		
		System.out.println("점수 : " + score + ", 학점 : " + grade);
	}

}
