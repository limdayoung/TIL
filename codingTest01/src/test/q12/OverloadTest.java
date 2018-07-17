package test.q12;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.17
 * ■ 대구분 : OOP개념 
 * ■ 소구분 : Encapsulation/Inheritance/Polymorphism/Overloading/Overriding/Type Casting (단답형)
 * ■ 난이도 : 중
 * 
 * [Q12] 다음 프로그램의 실행 결과를 적으시오.
 * 답 : 컴파일 오류, Fruits 클래스의 getName()은 final 메소드이기 떄문에 재정의 불가
 */
public class OverloadTest {

	public static void main(String[] argv) {
		new OverloadTest().test();
	}

	private void test() {
		Fruits fruits = new Apple();
		System.out.println(fruits.getName());
	}

	public class Fruits {
		private String name="hi";

		public Fruits() {
			this.name = "unknown";
		}

		final public String getName() {
			return name;
		}
	}

	public class Apple extends Fruits {
		/*public String getName() {
			return "Apple";
		}*/
	}
}

