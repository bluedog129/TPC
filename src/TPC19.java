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
		
		// 부모클래스로 객체를 받는 이유는 
		// 자식클래스의 구조를 모르더라도 부모타입 만으로도 
		// 오버라이딩을 통해 자식클래스를 동작시킬 수 있다. 
		// 이때 컴파일 시점에서는 부모가 동작되지만 
		// 실행할때는 재정의된 자식클래스를 찾아간다. (동적 바인딩)
		// 실행 후에 재정의된 클래스를 찾아가기 때문에 
		// 프로그램 속도가 떨어지는 원인이 되지만 이점이 크기에 자주 사용된다.
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		
	}
}
