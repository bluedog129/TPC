package kr.tpc;
// å(Object)->����, ����, ���ǻ�, ��������....
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// ����Ʈ������ : ��ü�� �����ϴ� �����ڸż���(����)
	public BookVO() {
		//�ʱ�ȭ �۾�
		// �����ص� ������, ���� �ڱ��ڽ��� ����Ű�� this�� �տ� �ٴ´�
		// �������� ���� this.�� ������
		this.title="�ڹ�";
		this.price = 14000;
		this.company = "������";
		this.page = 780;
	}
	
	// ������ �ż����� �ߺ�����(overloading)
	// �ߺ����Ǹ� �ϰ� �Ǹ� ����Ʈ�����ڰ� �ڵ����� �������� �ʴ´�
	// ��, �����ڰ� �ϳ� ��������� �Ǹ� ����Ʈ�����ڴ� �ڵ����� ��������� �ʴ´�
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
