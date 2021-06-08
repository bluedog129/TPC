import java.lang.*; // 디폴트 패키지(생략)

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		// 1. java에서 제공해주는 클래스들
		// 문자열(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); // apple
		
		// 2. 직접 만들어서 사용하는 class들/... DTO/VO, DAO, Utility .. API
		MyUtil my = new MyUtil();
		int sum = my.sum();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 클래스들... API
		// Gson -> json : https://mvnrepository.com
		Gson g = new Gson();
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		String json = g.toJson(vo);
		//{"title":"자바","price":13000,"company":"영진","page":800}
		System.out.println(json);
	}
}
