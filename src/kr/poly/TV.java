package kr.poly;

public class TV implements RemoCon{

	@Override
	public void chUp() {
		System.out.println("TV�� ä���� �ö󰣴�.");
	}

	@Override
	public void chDown() {
		System.out.println("TV�� ä���� ��������.");
	}

	@Override
	public void internet() {
		System.out.println("���ͳ��� �ȴ�.");
	}
	
	// ���ο� ��� �߰�
	
}