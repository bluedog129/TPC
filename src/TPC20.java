import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 { // eat() { ? }

	public static void main(String[] args) {
		// Animal 부모클래스를 사용하지 않음.
		Dog d =new Dog();
		d.eat(); // ? -> 개처럼 먹다
		
		Cat c = new Cat();
		c.eat(); 
		c.night();
		
		// Animal 부모클래스 사용.
		Animal ani = new Dog(); // upcasting(자동 형변환)
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		((Cat)ani).night(); // downcastiong(강제 형변환)
	}
}
