import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {

	public static void main(String[] args) {
		// upcasting
		Animal ani =new Cat();  // upcasting
		ani.eat(); // 컴파일 시점 -> Animal, 실행시점 -> Dog
		
		// downcasting
		Cat c = (Cat)ani;
		c.night();
		((Cat)ani).night();  // .이 우선순위가 더 높아서 ()로  
		
		ani = new Dog();
		ani.eat();
		// 다형성
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로다르게 동작시키는 원리
		
		Object o = new Dog();
		//o.eat();
		((Dog)o).eat();
		
	}

}
