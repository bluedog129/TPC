import kr.poly.A;

public class TPC28 {

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		System.out.println(a.toString());
		System.out.println(a); 
		//재정의를 하지 않으면 
		// kr.poly.A@7d6f77cc라는 번지가 문자형태로 출력된다.
		
		Object o = new A(); // upcasting
		((A)o).display();
		System.out.println(o.toString());
	}
}
