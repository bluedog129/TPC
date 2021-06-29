
public class TPC07 {

	public static void main(String[] args) {
		// Call By Value
		int a=20;
		float b = 56.7f;
		// a+b =?
		float v = sum(a,b);  
		System.out.println(v); //76.7s
		
		// ------------------------------------
		
		//Call By Reference
		int[] arr = {1,2,3,4,5};
		// 배열의 총합구하기
		int vv = arrSum(arr);
		System.out.println(vv);
	}
	
	// Call By Value(값 전달 기법) : 변수안의 값을 매서드의 매개변수로 전달하는 기법, 기억공간 개별
	// 메소드 호출이 가능한조건
	// 실인수와 가인수의 개수, DataType이 같아야함
	public static float sum(int a, float b) {
		float v =a+b;
		return v;
	}
	
	// Call By Reference(번지 전달 기법) : 변수안에 저장되어있는 해당배열의 메모리 번지값을 전달하는 기법, 기억공간 공유 
		private static int arrSum(int[] x) {
			int sum = 0;
			for(int i=0; i<x.length; i++) {
				sum += x[i];
			}
			
			return sum;
		}
}
