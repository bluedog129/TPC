import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
		//�ν��Ͻ� �ż��� ȣ��
		//Inflearn inf = new Inflearn();
		//inf.tpc();
		Inflearn.tpc();
		
		//static �ż��� ȣ��
		//inf.java();
		Inflearn.java();
		
		// Java API ������ private
		//System sys = new System();
		//�̷� API �����ڵ鵵 private ���� �̹Ƿ�
		System.out.println("���");
		// �� ���� ȣ���ؾ��Ѵ�.
		//Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
	}

}
