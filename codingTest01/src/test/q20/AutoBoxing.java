package test.q20;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : Data Type 
 * ■ 소구분 : Java data / Primitive / Reference type / Call by value (객관식)
 * ■ 난이도 : 하
 * [Q20] 다음 프로그램의 실행결과로 올바른 것은? 
 * ① 컴파일 오류가 발생한다.
 * ② 실행 시 오류가 발생한다.
 * ③ 0AB
 * ④ 065B
 * 답 : 3번.
 */
public class AutoBoxing {

	public static void main(String[] argv) {
		
		int idx = 0;
		char[] charArray = new char[10];
		
		charArray[idx++] = '0';
		charArray[idx++] = 65;
		charArray[idx++] = 'A' + 1;
		
		System.out.println( charArray );
	}

}

