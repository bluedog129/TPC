package kr.tpc;

public class OverLoad {
	// 동작(method)으로만 이루어진 객체
	// 각 매서드의 매개변수들 타입을 다르게 만들어서 
	// Overloading 시켰다.
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(float a, int b) {
		System.out.println(a+b);
	}
	public void sum(float a, float b) {
		System.out.println(a+b);
	}
}
