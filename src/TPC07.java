
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
		// �迭�� ���ձ��ϱ�
		int vv = arrSum(arr);
		System.out.println(vv);
	}
	
	// Call By Value(�� ���� ���) : �������� ���� �ż����� �Ű������� �����ϴ� ���, ������ ����
	// �޼ҵ� ȣ���� ����������
	// ���μ��� ���μ��� ����, DataType�� ���ƾ���
	public static float sum(int a, float b) {
		float v =a+b;
		return v;
	}
	
	// Call By Reference(���� ���� ���) : �����ȿ� ����Ǿ��ִ� �ش�迭�� �޸� �������� �����ϴ� ���, ������ ���� 
		private static int arrSum(int[] x) {
			int sum = 0;
			for(int i=0; i<x.length; i++) {
				sum += x[i];
			}
			
			return sum;
		}
}
