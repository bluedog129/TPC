import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		System.out.println(a.toString());
		System.out.println(a); 
		//�����Ǹ� ���� ������ 
		// kr.poly.A@7d6f77cc��� ������ �������·� ��µȴ�.
		
		Object o = new A(); // upcasting
		((A)o).display();
		System.out.println(o.toString());
	}
}
