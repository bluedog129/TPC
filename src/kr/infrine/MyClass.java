package kr.infrine;
//default : 같은 패키지 안 에서는 public 밖에서는 private
public class MyClass {
	public int sum(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}
