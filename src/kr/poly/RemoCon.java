package kr.poly;

public interface RemoCon { // ��ü����X ; RemoCon r = new Remocon();
	// ����� ��밡��
	int MAXCH = 100;  // RecoCon.MAXCH
	int MINCH = 1;  // RemoCon.MINCH
	
	// �߻�ż���
	public abstract void chUp();
	public void chDown();  // interface�� abstract�� �����Ǿ��ִ�.
	public void internet();
	
	
	
}
