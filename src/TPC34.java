//import java.lang.*; 이 디폴트값으로 생략되어 있다.
public class TPC34 {

	public static void main(String[] args) {
		//String    0123 순서의 인덱스
		String str = new String("APPLE");
		String v = str.toLowerCase();
		System.out.println(v);  // apple
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));  // -1 나오면 실패라는 의미
		System.out.println(str.replaceAll("P","X")); // AXXLE
	}
}