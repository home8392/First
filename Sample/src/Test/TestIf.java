package Test;

public class TestIf {

	public static void main(String[] args) {
		int num = 100;
		
		if(num > 0 )
			System.out.println("num 은 양수이다.");
		if(num < 0)
			System.out.println("num 은 음수이다.");
		
		// if ~ else 구문
		if(num % 2 == 0) {
			System.out.println("num은 짝수이다.");
		} else {
			System.out.println("num은 홀수이다.");
		}
		
		// if ~ else if 구문
		int score = 89;
		String grade = " ";
		
		if(score >= 90) {	// 90점 이상 A
			grade = "A";
		} else if(score >= 80) {	// 90점 이상 뺀 나머지 점수 중에 80점 이상
			grade = "B";
		} else if(score >= 70) {	// 90점 이상, 80점 이상을 뺀 나머지 점수 중에 70점 이상
			grade = "C";
		} else {	// 위에에서 해당 안된 나머지 점수들
			grade = "F";
		}
		
		System.out.println("점수 : " + score + ", 학점 : " + grade); 
		
		// 중첩 if 문
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
				grade += "+";
			}
		} else if(score >= 80) {
			grade = "B";
			if(score >= 88) {
				grade += "+";
			}
		} else if(score >= 70) {
			grade = "C";
			if(score >= 78) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		
		System.out.println("점수 : " + score + ", 학점 : " + grade);
	}

}
