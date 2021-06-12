package kr.poly;

public abstract class Animal { // 추상클래스(불완전한 객체)-->> Animal ani = new Animal();
	// Dog, Cat --> eat()
	public abstract void eat(); // 추상매서드=> 불완전한매서드, 장애매서드

	public void move() { // 구현매서드
		System.out.println("무리를 지어서 이동한다.");
	}
	
}
