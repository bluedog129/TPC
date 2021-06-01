import kr.tpc.BookDTO;

public class TCP10 {

	public static void main(String[] args) {
		//객체를 생성
		BookDTO b = new BookDTO();
		b.title = "자바";
		b.price = 17000;
		b.company = "영진";
		b.page = 670;
		
		System.out.println(b.title+'\t');
		System.out.println(b.price+'\t');
		System.out.println(b.company+'\t');
		System.out.println(b.page+'\t');
	}
}
