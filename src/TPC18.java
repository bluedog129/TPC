import java.lang.*; // ����Ʈ ��Ű��(����)

import kr.tpc.MyUtil;

public class TPC18 {
	public static void main(String[] args) {
		// 1. java���� �������ִ� Ŭ������
		// ���ڿ�(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); // apple
		
		// 2. ���� ���� ����ϴ� class��/... DTO/VO, DAO, Utility .. API
		MyUtil my = new MyUtil();
		int sum = my.sum();
		System.out.println(sum);
		
		// 3. �ٸ� ȸ�翡�� ����� ���� Ŭ������... API
		// Gson -> json : 
		
		
	}
}
