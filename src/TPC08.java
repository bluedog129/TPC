// TPC08이 실행되면 JVM이 먼저 구동된다.
// 그리고 해당 클캐스를 현재 디렉토리에서 찾는다.
public class TPC08 {
	// static키워드가 있는 메서드를 메모리(method Area - static zone)로 로딩한다.
	// 그리고 main()를 실행
	// 메서드가 호출되면 해당 메서드의 호출정보(지역변수)가 Stack Area에 저장된다.
	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		// add 메서드 호출 (같은 static 메서드가 아니면 서로 호출할 수 없다.)
		int v =add(a, b); // static method call
		System.out.println(v); 
	}
	
	public static int add(int a, int b) {
		int sum = a+ b;
		
		return sum;
	}
	
	// Stack Area가 비어 있으면 프로그램이 종료된 것이다.
}
