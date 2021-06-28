
import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		//관계를 이해하라. PDT(Primitive Data Type 기본자료형 VS UDDT(User Define Data Type 사용자 정의 자료형)
		
		// 클래스 : 새로운 자료형을 만드는 도구 (Modeling 도구)
		// 클래스 -> 객체 -> 인스턴스 : 하나의 대상을 설계해놓은 클래스를 객체의 형태로 메모리에 올려놓는 과정 
		// 그리고 이 과정을 '인스턴스화' 라고 하며 메모리에 할당된 객체를 인스턴스라고 부른다.
		
		// VO(Value Object) : 데이터를 담기위해 하나의 구조로 만들어놓은 객체
		// DTO(Data Transfer Object) : 데이터를 저장하고 다른 객체로 이동시키는 객체
		
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		// a변수 안에 10이라는 정수형이 저장된다. (데이터를 1개만 저장)
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
		// 메모리 위에 생성된 Book이라는 객체의 번지를 b라는 변수(객체변수, 인스턴스변수)가 가리킨다. 
		b = new Book();
		
		b.title ="java";
		b.price = 1000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.println(b.title);
		System.out.print(b.price+"\n");
		System.out.println(b.company);
		System.out.println(b.page);
		System.out.println("\n");
		
		// 사람
		PersonVO p;
		// 메모리 위에 생성된 Person이라는 객체의 번지를 p라는 변수(객체변수, 인스턴스변수)가 가리킨다. 
		p = new PersonVO();
		
		p.name="박매일";
		p.age = 40;
		p.weight = 69.4f;
		p.height = 175.7f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
		
		
	}
}
