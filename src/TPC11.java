import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		// å 1���� �����ϱ� ���� ��ü�� �����Ͻÿ�.
		BookVO b = new BookVO();
		b.title = "���̽�";
		b.price = 16000;
		b.company = "������";
		b.page = 700;
		
		System.out.println(b.title+"\t");
		System.out.println(b.price+"\t");
		System.out.println(b.company+"\t");
		System.out.println(b.page+"\t\n");
		
		BookVO b2 = new BookVO();
		b2.title = "����Ŭ";
		b2.price = 16000;
		b2.company = "������ �ۺ���";
		b2.page = 700;
		
		System.out.println(b2.title+"\t");
		System.out.println(b2.price+"\t");
		System.out.println(b2.company+"\t");
		System.out.println(b2.page+"\t");
		
	}
}
