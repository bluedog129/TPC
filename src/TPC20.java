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
		// 변수가 부모클래스의 객체를 우선 가리킨다.
		// 그리고 서로 상속관계에 있기 때문에 Dog가 extend되어
		// 오버라이드된 메서드를 동작시킬때 Dog에 접근할 수 있다.
		Animal ani = new Dog(); // upcasting(자동 형변환)
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		((Cat)ani).night(); // downcasting(강제 형변환)
	}
}
