package test.q11;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * 
 * 인터페이스 : 상속 X, 생성 X
 * 다른 인터페이스 상속 가능
 * 인터페이스가 상속받은 인터페이스를 class가 구현할 경우,
 * 두 인터페이스에 있는 모든 메소드를 재정의 해야한다.
 * 안한다면, abstract class로 선언되야 한다.
 */

public class Test implements Test1, Test2{
	
	@Override
	public void test1(String b) {
	}

	@Override
	public void test2(int a) {
	}
	
	public static void main(String[] args) {
		System.out.println("Test2 호출 : " + Test2.NUMBER);
	}

}

interface Test1 extends Test2{
	void test1(String b);
}

interface Test2 {
	//변수 - 상수
	public static final int NUMBER = 10;
	
	//메소드 - 기능 없음
	public abstract void test2(int a);
}