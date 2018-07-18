package test.q17;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : 기초문법 
 * ■ 소구분 : 조건문/반복문/연산자 (단답형)
 * ■ 난이도 : 하
 * [Q17] 아래 프로그램 출력 결과를 적으시오.
 * 답 : Equal 11
 */
public class OperatorTest {

	public static void main(String[] argv) {
		int a = 10;
		boolean b = false;
		
		/*test
		System.out.println(b == true);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(true || false);*/
		
		if ((b == true) || (a++ == 10)) { //false or 
			System.out.println("Equal " + a);
		} else {
			System.out.println("Not equal! " + a);
		}
	}
}

