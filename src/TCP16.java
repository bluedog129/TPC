import kr.tpc.OverLoad;

public class TCP16 {

	public static void main(String[] args) {
		//1+1=?, 23, 4+56=?, 56.7+78.9=?
		OverLoad ov = new OverLoad();
		ov.sum(20, 50); // ov.hap_int_int(20,50)
		ov.sum(23.4f, 56); // ov.hap_float_int()
		ov.sum(56.7f, 78.9f); // ov.hap_float_float(56.7f, 78.9f)
	}
}
