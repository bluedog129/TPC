import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {

	public static void main(String[] args) {
		// eat() --override--> eat()
		// upcasting���� Ȱ��(�θ��� ����)
		Animal ani = new Dog();
		ani.eat();
		ani.move();
		System.out.println("");
		
		ani = new Cat();
		ani.eat();
		((Cat)ani).night();
		ani.move();
	}
}
