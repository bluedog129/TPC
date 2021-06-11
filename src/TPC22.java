import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {
		// upcasting
		Animal ani =new Cat();  // upcasting
		ani.eat(); // ������ ���� -> Animal, ������� -> Dog
		
		// downcasting
		Cat c = (Cat)ani;
		c.night();
		((Cat)ani).night();  // .�� �켱������ �� ���Ƽ� ()��  
		
		ani = new Dog();
		ani.eat();
		// ������
		// ����Ŭ������ ����Ŭ�������� ������ �޼����� ���δٸ��� ���۽�Ű�� ����
		
		Object o = new Dog();
		//o.eat();
		((Dog)o).eat();
		
	}

}
