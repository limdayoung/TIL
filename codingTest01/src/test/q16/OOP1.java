package test.q16;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : OOP개념 
 * ■ 소구분 : Encapsulation/Inheritance/Polymorphism/Overloading/Overriding/Type Casting(객) 
 * ■ 난이도 : 중
 * 
 * [Q16] 다음 설명 중 틀린 것을 고르시오. (객관식)
 * ① 추상 클래스(abstract class)는 하나 이상의 추상 메소드(abstract method)를 포함하고 있어야 한다.
 * ② 추상 클래스는 객체를 생성할 수 없다.
 * ③ protected 메소드는 모든 하위 클래스에서 호출할 수 있다.
 * ④ 인터페이스를 구현한 클래스는 인터페이스에 포함된 모든 메소드를 구현하지 않아도 된다.
 * ⑤ 자바의 모든 클래스는 Object 클래스의 자식 클래스이다.
 * ⑥ A 클래스의 b 메소드를 하위 클래스 C에서 오버로딩한 경우, 하위 C 클래스에서 상위 클래스의 b 메소드를 호출할 수 있다.
 * 답 : 1. 추상클래스는 추상메소드를 포함하지 않아도 된다.
 */
public abstract class OOP1 {
	public static void main(String[] args) {
		System.out.println("abstract 추상클래스는 abstrat method를 포함하지 않아도 된다.");
		
		C c = new C();
		System.out.println(c.b());
	}
}

class A{
	
	public int b() {
		int number = 3;
		return number;
	}
}

class C extends A{
	
	@Override
	public int b() {
		return super.b();
	}
}
