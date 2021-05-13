package test.inherit;

import access.sample.Child;
import access.sample.Parent;

public class TestOveriding {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display();
		
		Child c= new Child();
		c.out();
		c.display();
	}

}
