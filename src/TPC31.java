import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
		//인스턴스 매서드 호출
		//Inflearn inf = new Inflearn();
		//inf.tpc();
		Inflearn.tpc();
		
		//static 매서드 호출
		//inf.java();
		Inflearn.java();
		
		// Java API 생성자 private
		//System sys = new System();
		//이런 API 생성자들도 private 형태 이므로
		System.out.println("출력");
		// 와 같이 호출해야한다.
		//Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
	}

}
