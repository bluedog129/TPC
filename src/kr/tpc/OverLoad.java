package kr.tpc;

public class OverLoad {
	// ����(method)���θ� �̷���� ��ü
	// �� �ż����� �Ű������� Ÿ���� �ٸ��� ���� 
	// Overloading ���״�.
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
