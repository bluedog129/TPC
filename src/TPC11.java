import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// 책 1권을 저장하기 위해 객체를 생성하시오.
		BookVO b = new BookVO();
		b.title = "파이썬";
		b.price = 16000;
		b.company = "에이콘";
		b.page = 700;
		
		System.out.println(b.title+"\t");
		System.out.println(b.price+"\t");
		System.out.println(b.company+"\t");
		System.out.println(b.page+"\t\n");
		
		BookVO b2 = new BookVO();
		b2.title = "오라클";
		b2.price = 16000;
		b2.company = "이지스 퍼블리싱";
		b2.page = 700;
		
		System.out.println(b2.title+"\t");
		System.out.println(b2.price+"\t");
		System.out.println(b2.company+"\t");
		System.out.println(b2.page+"\t");
		
	}

}
