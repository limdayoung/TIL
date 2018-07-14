package test.q03;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 객체와 Class
 * ■ 소구분 : 객체 생성과 사용 / Class선언 / 생성자 / 접근제한자 / 기타제한자(Static, Final, Abstract) (객관식)
 * ■ 난이도 : 하
 * [Q3] 다음 코드 상의 ___ 위치에 들어갈 수 없는 키워드를 고르시오. : 2번 (변수,생성자,메소드에서만 사용가능)
 * 1)public 2)private 3)abstract 4)final
 * 해설 : 접근제한자 중 class 선언구에는 public, default만 작성할 수 있다.
 * 기타제한자 중 class 선언구에는 final, abstract만 작성할 수 있다.
 */
public class ATestClass {
	public static void main(String[] argv) {
		
	}
}

abstract class ATestClass1 {
	public static void main(String[] argv) {
		
	}
}

final class ATestClass2 {
	public static void main(String[] argv) {
		
	}
}
