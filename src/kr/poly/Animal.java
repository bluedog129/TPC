package kr.poly;

public abstract class Animal { // �߻�Ŭ����(�ҿ����� ��ü)-->> Animal ani = new Animal();
	// Dog, Cat --> eat()
	public abstract void eat(); // �߻�ż���=> �ҿ����Ѹż���, ��ָż���

	public void move() { // �����ż���
		System.out.println("������ ��� �̵��Ѵ�.");
	}
	
}
