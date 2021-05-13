package oop.sample.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	
	// 기본 생성자
	public Person() {}
	
	// 매개변수 있는 생성자
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void display() {
		System.out.println(name + "," + age + " 세, " + gender + "자");
	}
}
