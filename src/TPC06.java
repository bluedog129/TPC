
public class TPC06 {

	public static void main(String[] args) {
		//5. �޼��� -> ����(method), ���(function)
		
		int a = 67;
		int b = 98;
		//a+b=?
		int result = sum(a,b);
		System.out.println(result);
		
		int sum = 0;
		int[] arr = makeArr();
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	// ���� 2���� �Ű������� �޾Ƽ� ���Ͽ� ������ ���Ͽ� �����ϴ� �޼��带 �����Ͻÿ�
	public static int sum(int a, int b) {
		int v = a+b;
		return v;
	}
	//10,20,30
	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr=new int[3];
		arr[0]=x;
		arr[1]=y;
		arr[2]=z;
		
		return arr;
	}
}
