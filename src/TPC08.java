// TPC08�� ����Ǹ� JVM�� ���� �����ȴ�.
// �׸��� �ش� Ŭĳ���� ���� ���丮���� ã�´�.
public class TPC08 {
	// staticŰ���尡 �ִ� �޼��带 �޸�(method Area - static zone)�� �ε��Ѵ�.
	// �׸��� main()�� ����
	// �޼��尡 ȣ��Ǹ� �ش� �޼����� ȣ������(��������)�� Stack Area�� ����ȴ�.
	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		// add �޼��� ȣ�� (���� static �޼��尡 �ƴϸ� ���� ȣ���� �� ����.)
		int v =add(a, b); // static method call
		System.out.println(v); 
	}
	
	public static int add(int a, int b) {
		int sum = a+ b;
		
		return sum;
	}
	
	// Stack Area�� ��� ������ ���α׷��� ����� ���̴�.
}
