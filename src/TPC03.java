
import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		//���踦 �����϶�. PDT(Primitive Data Type �⺻�ڷ��� VS UDDT(User Define Data Type ����� ���� �ڷ���)
		
		// Ŭ���� : ���ο� �ڷ����� ����� ���� (Modeling ����)
		// Ŭ���� -> ��ü -> �ν��Ͻ� : �ϳ��� ����� �����س��� Ŭ������ ��ü�� ���·� �޸𸮿� �÷����� ���� 
		// �׸��� �� ������ '�ν��Ͻ�ȭ' ��� �ϸ� �޸𸮿� �Ҵ�� ��ü�� �ν��Ͻ���� �θ���.
		
		// VO(Value Object) : �����͸� ������� �ϳ��� ������ �������� ��ü
		// DTO(Data Transfer Object) : �����͸� �����ϰ� �ٸ� ��ü�� �̵���Ű�� ��ü
		
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a;
		// a���� �ȿ� 10�̶�� �������� ����ȴ�. (�����͸� 1���� ����)
		a = 10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		Book b;
		// �޸� ���� ������ Book�̶�� ��ü�� ������ b��� ����(��ü����, �ν��Ͻ�����)�� ����Ų��. 
		b = new Book();
		
		b.title ="java";
		b.price = 1000;
		b.company = "�Ѻ��̵��";
		b.page = 700;
		
		System.out.println(b.title);
		System.out.print(b.price+"\n");
		System.out.println(b.company);
		System.out.println(b.page);
		System.out.println("\n");
		
		// ���
		PersonVO p;
		// �޸� ���� ������ Person�̶�� ��ü�� ������ p��� ����(��ü����, �ν��Ͻ�����)�� ����Ų��. 
		p = new PersonVO();
		
		p.name="�ڸ���";
		p.age = 40;
		p.weight = 69.4f;
		p.height = 175.7f;
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.weight);
		System.out.println(p.height);
		
		
	}
}
