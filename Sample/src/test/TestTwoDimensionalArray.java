package test;

public class TestTwoDimensionalArray {

	public static void main(String[] args) {
		// 다차원 배열
		int score[][] = {{1, 2, 3}, {4, 5, 6}};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println(i + "행" + j + "열 : " + score[i][j] + "\t");
			}
			System.out.println();
			//			0열	1열	2열
			// 0행		1		2		3
			// 1행		4		5		6
		}
		
		// 2차원 가변배열 초기화	
		int[][] score1 = new int[3][];
		
		score1[0] = new int[4];
		score1[1] = new int[3];
		score1[2] = new int[2];
		
		score1[0][1] = 11;
		
		for(int i = 0; i < score1.length; i++) {
			for(int j = 0; j < score1[i].length; j++) {
				System.out.print(score1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
