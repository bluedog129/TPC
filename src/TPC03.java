import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		//관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선선하시오.
		
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b;
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
