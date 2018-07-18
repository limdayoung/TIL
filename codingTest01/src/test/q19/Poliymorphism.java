package test.q19;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : OOP개념 
 * ■ 소구분 : Encapsulation/Inheritance/Polymorphism/Overloading/Overriding/Type Casting (단답형) 
 * ■ 난이도 : 중 
 * [Q19] 다음 프로그램의 실행 결과를 적으시오. (만일 실행할 수 없다면 그 이유를 적으시오.)
 * 답 : base class의 private메소드는 오버라이드 할 수 없다.
 */
public class Poliymorphism {

	private void f() {
		System.out.println("base class");
	}

	public static void main(String[] argv) {
		
		/*Poliymorphism po = new Derived();
		po.f();*/
	}
	
	class Derived extends Poliymorphism {
		
		public void f() {
			System.out.println("sub class");
		}
	}
}

