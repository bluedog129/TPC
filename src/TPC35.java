
public class TPC35 {

	public static void main(String[] args) {
		// �������� ���ڿ��� �����
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		// ������ ��
		if(str1 == str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// ���ڿ� ��ü�� ��
		if(str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//----------------------------
		// literal pool �� ���ڿ��� �����
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		// literal pool�� ���� ���ڿ��� �����Ҷ� ���� ������ �Ǳ� ������
		// ���� ������ ����Ű�� str3,4�� ���� ���ٰ� ���´�.
		if(str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// �׷��� �ǵ����̸� == ���ٴ�  equals�� ���ϴ°��� ����
		// �׻� literal pool ������ ��������� �ʱ� ����
		if(str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
