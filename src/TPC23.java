import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {

	public static void main(String[] args) {
		// 1. �������μ� 
			Dog d = new Dog();
			display(d);
			Cat c = new Cat();
			display(c);
			
	}
											//up casting
	private static void display(Animal r) { // ������ �μ�
			r.eat();
			
			// instance of : Cat Ÿ������ ������� �����̸� true �ƴϸ� false�� ��ȯ�Ѵ�.
			// ���� Cat Ÿ���� ������ ��츸 down casting�� �����ϴ�.
			if( r instanceof Cat) {
				((Cat)r).night();  // down casting
			}
	}
}