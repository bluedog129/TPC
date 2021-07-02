import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// Dog, Cat --> Animal 
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		// Dog.java(x), Dog.class(o)
		
		//Dog dd = new Dog();
		
		// Animal <--- [Dog.class, Cat.class]
		
		// �θ�Ŭ������ ��ü�� �޴� ������ 
		// �ڽ�Ŭ������ ������ �𸣴��� �θ�Ÿ�� �����ε� 
		// �������̵��� ���� �ڽ�Ŭ������ ���۽�ų �� �ִ�. 
		// �̶� ������ ���������� �θ� ���۵����� 
		// �����Ҷ��� �����ǵ� �ڽ�Ŭ������ ã�ư���. (���� ���ε�)
		// ���� �Ŀ� �����ǵ� Ŭ������ ã�ư��� ������ 
		// ���α׷� �ӵ��� �������� ������ ������ ������ ũ�⿡ ���� ���ȴ�.
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		
	}
}
