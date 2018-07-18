package test.q08;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : Data Type
 * ■ 소구분 : Java data / Primitive / Reference type / Call by value (객관식)
 * ■ 난이도 : 하
 * [Q8] 자바 데이터 타입에 대한 설명 중 틀린 것을 고르시오. 
 * 답 : 4번
 * ① String 타입은 객체형이다.
 * ② char 타입 변수는 2 byte의 메모리 공간을 사용한다.
 * ③ char 타입 변수 선언 시 기본 값을 지정하지 않으면 ‘\u00000’ 값이 설정된다.
 * ④ boolean 타입은 1 byte의 메모리 공간을 사용한다.
 * ⑤ int 타입 변수는 4 byte의 메모리 공간을 사용한다.
 */
public class DataType {
	public static void main(String[] args) {

		String a="a";
		String b="b";
		String c="a";
		String st = new String("a");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==b);
		
		System.out.println(a==st);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(st);

	
	}
}
