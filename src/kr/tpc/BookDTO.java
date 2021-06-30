package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// ����Ʈ ������ �ż��� (���� �����Ǿ� ����)
	public BookDTO() {
		// ��ü�� �����ϴ� �۾��� �Ѵ�. (heap������ ����, �����ڵ�)
		
	}
	// ��ü�� heap������ �����ʰ� ���ÿ� this ��� ��ü�� �����ͷ� �ش簴ü�� ����Ų��.
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}