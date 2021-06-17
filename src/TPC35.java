
public class TPC35 {

	public static void main(String[] args) {
		// 힙영역에 문자열이 저장됨
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		// 번지를 비교
		if(str1 == str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// 문자열 개체를 비교
		if(str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		//----------------------------
		// literal pool 에 문자열이 저장됨
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		// literal pool은 같은 문자열을 저장할때 번지 재사용이 되기 때문에
		// 같은 번지를 가리키는 str3,4의 값은 같다고 나온다.
		if(str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// 그래도 되도록이면 == 보다는  equals로 비교하는것이 좋다
		// 항상 literal pool 영역을 사용하지는 않기 때문
		if(str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
