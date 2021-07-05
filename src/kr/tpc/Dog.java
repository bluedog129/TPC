package kr.tpc;

public class Dog extends Animal{
	//이름, 나이, 종 : 상태정보
	//재 정의 (override)
	public void eat() {
		System.out.println("개처럼 먹다");
	}
	public Dog() {
		super(); // new Animal(); 자식이 부모클래스를 생성한 것과 같은 의미
	}
}
