package oop.sample;

public class Point {		// 클래스 헤더
	private int posX;	// 멤버필드
	private int posY;
	
	// 메소드
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public void out() {
		System.out.println("[" + posX + ", " + posY + "]");
	}
	
	// 생성자
	public Point() {
		this(10, 20);
	}
	public Point(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;		
	}
	
}
