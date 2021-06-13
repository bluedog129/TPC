package kr.tpc;

public class JavaOracle implements Dbconnect{

	@Override
	public void getConnection(String url, String user, String pass) {
		System.out.println("Oracle DB가 접속됩니다.");
		
	}
}
