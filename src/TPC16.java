import kr.tpc.OverLoad;

public class TPC16 {

	public static void main(String[] args) {
		OverLoad ov = new OverLoad();
		
		ov.sum(20, 50); // ov.hap_int(20,50)
		ov.sum(10.3f, 4); // ov.hap_float_int(10.3f, 4)
		ov.sum(10.3f, 4.5f); // ov.hap_float_float(10.3f, 4.5f)
		
		// 컴파일 시점에서 각각 다른 매개변수 타입의 이름으로 저장되어 있기 때문에
		// 넣는 매개변수 자료형 값에 따라서 맞게 찾아들어간다.
		// 이를 정적바인딩 (오버로딩 Overloading)이라고 한다.
		// 아예다른 매서드로 서로 들어가기 때문에 속도에 영향을 미치지 않는다.
	}
}
