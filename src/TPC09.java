
public class TPC09 {

	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		
		//int v = sum();
		// 1. heap Area(힙) 메모리영역에 TPC09클래스가 올라감
		// 이때, Stack 메모리영역에 올라와있는 main 메소드의 
		// tpc변수가 포인터로 힙영역의 TPC09객체를 가리킨다.
		TPC09 tpc = new TPC09(); 
		// 2. TPC객체 생성후 작성된 sum메서드 또한 heap영역에 존재하게되는데
		// heap영역에 존재하는 sum메서드의 코드는 사실 methodArea에 존재하고 있으며,
		// 그 코드를 heap에 존재하고 있는 sum메서드가 포인터고 가리키고 있는 구조이다.
		int v = tpc.sum(a, b);
		System.out.println(v);
	}
	// 3. 그리고 methodArea에 존재하는 코드가 이번에는 Stack에 들어가서 add를 동작시킨다. 
	public int sum(int a, int b) {
		int v = a+b;
		
		return v;
	}
}
