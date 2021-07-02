import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 { // eat() { ? }

	public static void main(String[] args) {
		// Animal �θ�Ŭ������ ������� ����.
		Dog d =new Dog();
		d.eat(); // ? -> ��ó�� �Դ�
		
		Cat c = new Cat();
		c.eat(); 
		c.night();
		
		// Animal �θ�Ŭ���� ���.
		// ������ �θ�Ŭ������ ��ü�� �켱 ����Ų��.
		// �׸��� ���� ��Ӱ��迡 �ֱ� ������ Dog�� extend�Ǿ�
		// �������̵�� �޼��带 ���۽�ų�� Dog�� ������ �� �ִ�.
		Animal ani = new Dog(); // upcasting(�ڵ� ����ȯ)
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		((Cat)ani).night(); // downcasting(���� ����ȯ)
	}
}
