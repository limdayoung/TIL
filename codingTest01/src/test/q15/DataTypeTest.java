package test.q15;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : Data Type 
 * ■ 소구분 : Java data / Primitive / Reference type / Call by value (객관식)
 * ■ 난이도 : 하
 * [Q15] 다음 코드 및 예측 결과 중 틀린 해석을 고르시오.
 * ① int a = 3.5; // 컴파일 오류가 발생한다.
 * ② int a1 = 5; double a2 = (float)a1; // 정상 동작한다.
 * ③ int a = 9 / 0; // 컴파일 오류가 발생한다. // numberformat Exception
 * ④ Integer a = new Integer(2); Integer b = new Integer(2); System.out.println( a == b ); // false를 출력한다. // o 주소값 다름
 * 답 : 3번. 런타임 오류 발생 - ArithmeticException
 */
public class DataTypeTest {
	
	public static void main(String[] args) {
		
		//int a = 3.5;
		
		int a1 = 5; double a2 = (float)a1;
		System.out.println(a1+" "+a2);
		
		// int a = 9 / 0;
		
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		System.out.println( a == b );
	}
}
