import kr.tpc.BookDTO;

public class TCP10 {

	public static void main(String[] args) {
		//��ü�� ����
		BookDTO b = new BookDTO();
		b.title = "�ڹ�";
		b.price = 17000;
		b.company = "����";
		b.page = 670;
		
		System.out.println(b.title+'\t');
		System.out.println(b.price+'\t');
		System.out.println(b.company+'\t');
		System.out.println(b.page+'\t');
	}
}
