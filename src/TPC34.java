//import java.lang.*; �� ����Ʈ������ �����Ǿ� �ִ�.
public class TPC34 {

	public static void main(String[] args) {
		//String    0123 ������ �ε���
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);  // apple
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));  // -1 ������ ���ж�� �ǹ�
		System.out.println(str.replaceAll("P","X")); // AXXLE
	}
}