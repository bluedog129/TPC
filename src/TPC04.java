
public class TPC04 {

	public static void main(String[] args) {
		// 4. �����͸� �̵��϶�(���� vs �迭)
		
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c=? �޼ҵ� ó�� => sum()
		sum(a,b,c);
		
		int[] arr = new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		// �޼ҵ�ó��
		sum2(arr);
		
		
	}
	
	//sum �޼ҵ�
	public static void sum(int x, int y, int z) {
		int sum = x+y+z;
		System.out.println(sum);
	}
	// sum2 �޼ҵ�
	public static void sum2(int[] x) {
		int sum = 0;
		// �ݺ��� Ȱ�� - for, while
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
}
