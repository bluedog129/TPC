import kr.tpc.BookDTO;

public class TPC13 {

	public static void main(String[] args) {
		//å -> class(BookDTO) -> ��ü -> �ν��Ͻ�
		String title = "������";
		int price = 25000;
		String company = "������";
		int page = 890;
		
		// ���� dto�� ��ü(object)����.. ���� ��Ʈ�Ͻ��� ����Ű�� ���� �ʱ� ����
		BookDTO dto;  
		// ���� dto�� �������� ������ BookDTO�� ����Ű�� �����Ƿ� �ν��Ͻ� �����̴�
		// title, price, company, page�� �ϳ��� ������
		dto = new BookDTO(title, price, company, page); 
		
		
		bookPrint(dto);
		
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.println(dto.title+"\t");
		System.out.println(dto.price+"\t");
		System.out.println(dto.company+"\t");
		System.out.println(dto.page+"\t");
	}
}
