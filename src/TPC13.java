import kr.tpc.BookDTO;

public class TPC13 {

	public static void main(String[] args) {
		//책 -> class(BookDTO) -> 객체 -> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890;
		
		BookDTO dto;  // 현재 dto는 객체(object)상태.. 아직 인트턴스를 가리키고 있지 않기 때문
		dto = new BookDTO(title, price, company, page); // 이제 dto는 힙영역에 생성된 BookDTO를 가리키고 있으므로 인스턴스 상태이다
		
		
		bookPrint(dto);
		
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title+"\t");
		System.out.println(dto.price+"\t");
		System.out.println(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
}
