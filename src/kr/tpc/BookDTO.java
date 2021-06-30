package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트 생성자 매서드 (원래 생략되어 있음)
	public BookDTO() {
		// 객체를 생성하는 작업을 한다. (heap영역에 생성, 기계어코드)
		
	}
	// 객체가 heap영역에 생성됨과 동시에 this 라는 객체가 포인터로 해당객체를 가리킨다.
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}