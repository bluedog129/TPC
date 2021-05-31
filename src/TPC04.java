
public class TPC04 {

	public static void main(String[] args) {
		// 4. 데이터를 이동하라(변수 vs 배열)
		
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c=? 메소드 처리 => sum()
		sum(a,b,c);
		
		int[] arr = new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		// 메소드처리
		sum2(arr);
		
		
	}
	
	//sum 메소드
	public static void sum(int x, int y, int z) {
		int sum = x+y+z;
		System.out.println(sum);
	}
	// sum2 메소드
	public static void sum2(int[] x) {
		int sum = 0;
		// 반복문 활용 - for, while
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
}
