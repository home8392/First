package oop.test;

import oop.sample.vo.Person;

public class TestArray {

	public static void main(String[] args) {
		Person[] list = new Person[3];
		list[0] = new Person("김개똥", 19, '남');
		list[1] = new Person("김말똥", 20, '남');
		list[2] = new Person("김소똥", 21, '여');
	
		for(int i = 0; i < list.length; i++ ) {
			System.out.println(list[i].getName() + " " + list[i].getGender() + " " + list[i].getAge());
		}
	}
}
