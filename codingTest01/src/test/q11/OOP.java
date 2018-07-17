package test.q11;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.17
 * ■ 대구분 : OOP개념 
 * ■ 소구분 : Encapsulation/Inheritance/Polymorphism/Overloading/Overriding/Type Casting (객관식)
 * ■ 난이도 : 하 
 * 답 : 2, 4, 5
 * [Q11] 다음 자바 언어에서의 객체지향 기법에 대한 설명 중 틀린 것을 모두 고르시오.
 * ① 클래스는 복수의 인터페이스를 구현(implements)할 수 있다. /o
 * ② 클래스는 복수의 부모 클래스(super class)로부터 상속(inherit) 받을 수 없다. /x
 * ③ 인터페이스는 또 다른 인터페이스로부터 상속 받을 수 있다. /o
 * ④ 모든 클래스는 상속을 통한 확장(extend)이 가능하다. /x final class 상속 불가
 * ⑤ 인터페이스와 상위 클래스(super class)는 코드 재사용을 위한 기법이 아니다. /x
 */
public class OOP extends OOP1 {
	
	int A = super.number;
	String B = super.name;
}

class OOP1 extends OOP2{
	int number=1;
}

class OOP2{
	String name="A";
}

