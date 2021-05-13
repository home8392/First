package inherit.bind;

import access.sample.Child;
import access.sample.Parent;

public class TestBinding {
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.display();	// 컴파일시에는 정적 바인딩, 실행시에는 동적 바인딩됨
	}
}
