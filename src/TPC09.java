
public class TPC09 {

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		
		//int v = sum();
		// 1. heap Area(��) �޸𸮿����� TPC09Ŭ������ �ö�
		// �̶�, Stack �޸𸮿����� �ö���ִ� main �޼ҵ��� 
		// tpc������ �����ͷ� �������� TPC09��ü�� ����Ų��.
		TPC09 tpc = new TPC09(); 
		// 2. TPC��ü ������ �ۼ��� sum�޼��� ���� heap������ �����ϰԵǴµ�
		// heap������ �����ϴ� sum�޼����� �ڵ�� ��� methodArea�� �����ϰ� ������,
		// �� �ڵ带 heap�� �����ϰ� �ִ� sum�޼��尡 �����Ͱ� ����Ű�� �ִ� �����̴�.
		int v = tpc.sum(a, b);
		System.out.println(v);
	}
	// 3. �׸��� methodArea�� �����ϴ� �ڵ尡 �̹����� Stack�� ���� add�� ���۽�Ų��. 
	public int sum(int a, int b) {
		int v = a+b;
		
		return v;
	}
}
