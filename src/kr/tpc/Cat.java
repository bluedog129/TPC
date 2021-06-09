package kr.tpc;

public class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("°í¾çÀÌ Ã³·³ ¸Ô´Ù.");
	}

	public void night() {
		System.out.println("¹ã¿¡ ´«¿¡¼­ ºûÀÌ ³­´Ù.");
	}
}
