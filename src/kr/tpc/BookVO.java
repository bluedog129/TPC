package kr.tpc;
// 책(Object)->제목, 가격, 출판사, 페이지수....
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트생성자 : 객체를 생성하는 생성자매서드(생략)
	public BookVO() {
		//초기화 작업
		// 생략해도 되지만, 본래 자기자신을 가리키는 this가 앞에 붙는다
		// 가독성을 위해 this.을 붙이자
		this.title="자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}
	
	// 생성자 매서드의 중복정의(overloading)
	// 중복정의를 하게 되면 디폴트생성자가 자동으로 생성되지 않는다
	// 즉, 생성자가 하나 만들어지게 되면 디폴트생성자는 자동으로 만들어지지 않는다
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
