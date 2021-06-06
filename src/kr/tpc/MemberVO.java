package kr.tpc;

public class MemberVO {
	//모든 멤버는 정보은닉한다.
	private String name;
	private int age;
	private String tel;
	private String addr;
	//디폴트 생성자 명시적으로 만들어준다.
	public MemberVO() {
		
	}
	//초기화 생성자를 이용하여 초기화를 중복정의 해준다.
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	// setter, getter method 만들어준다.
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	//toString을 이용하여  객체가 가진 모든 값을 String으로 넘겨주는 메서드를 만들어준다.
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
}
