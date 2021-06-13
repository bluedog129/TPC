import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TCP26 {

	public static void main(String[] args) {
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		System.out.println("");
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
	}
}
