package test.q18;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : OOP개념 
 * ■ 소구분 : Encapsulation/Inheritance/Polymorphism/Overloading/Overriding/Type Casting (객관식)
 * ■ 난이도 : 중
 * [Q18] 다음은 메소드 오버라이딩 예제이다. 잘못된 설명을 고르시오.
 * ① SuperClass의 doh(char c) 와 doh(float f) 메소드는 오버로딩(overloading)된 메소드이다.
 * ② SubClass의 doh(OtherClass o) 메소드는 오버라이딩(overriding)된 메소드가 아니다.
 * ③ test() 메소드 내에서 a.doh(1) 라인에서 컴파일 오류가 발생한다.
 * ④ SuperClass의 doh(char c), doh(float f) 메소드를 SubClass에서 사용할 수 있다.
 * 답 : 3. a.doh(1) 호출 시 int 값은 float 형태로 자동형변환 된다.
 */
public class OverrideTest {

	public static void main() {
		
		new OverrideTest().test();
	}
	
	private void test() {
		SuperClass a = new SubClass();
		a.doh(1);
	}

	class SuperClass {
	
		public char doh(char c) {
			System.out.println("doh(char)");
			return 'c';
		}
		
		public float doh(float f) {
			System.out.println("doh(float)");
			return 1.0f;
		}
	}
	
	class OtherClass { }
	
	class SubClass extends SuperClass {
		
		public void doh(OtherClass o) {
			System.out.println("doh(OtherClass)");
		}
	}
}


