import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		// 1. 다형성인수 
			Dog d = new Dog();
			display(d);
			Cat c = new Cat();
			display(c);
			
	}
											//up casting
	private static void display(Animal r) { // 다형성 인수
			r.eat();
			
			// instance of : Cat 타입으로 만들어진 변수이면 true 아니면 false를 반환한다.
			// 따라서 Cat 타입의 변수인 경우만 down casting이 가능하다.
			if( r instanceof Cat) {
				((Cat)r).night();  // down casting
			}
	}
}