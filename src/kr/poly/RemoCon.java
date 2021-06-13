package kr.poly;

public interface RemoCon { // 객체생성X ; RemoCon r = new Remocon();
	// 상수를 사용가능
	int MAXCH = 100;  // RecoCon.MAXCH
	int MINCH = 1;  // RemoCon.MINCH
	
	// 추상매서드
	public abstract void chUp();
	public void chDown();  // interface는 abstract가 생략되어있다.
	public void internet();
	
	
	
}
