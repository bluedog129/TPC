import kr.tpc.OverLoad;

public class TPC16 {

	public static void main(String[] args) {
		OverLoad ov = new OverLoad();
		
		ov.sum(20, 50); // ov.hap_int(20,50)
		ov.sum(10.3f, 4); // ov.hap_float_int(10.3f, 4)
		ov.sum(10.3f, 4.5f); // ov.hap_float_float(10.3f, 4.5f)
		
		// ������ �������� ���� �ٸ� �Ű����� Ÿ���� �̸����� ����Ǿ� �ֱ� ������
		// �ִ� �Ű����� �ڷ��� ���� ���� �°� ã�Ƶ���.
		// �̸� �������ε� (�����ε� Overloading)�̶�� �Ѵ�.
		// �ƿ��ٸ� �ż���� ���� ���� ������ �ӵ��� ������ ��ġ�� �ʴ´�.
	}
}
