package test.q05;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 예외처리
 * ■ 소구분 : Exception 카테고리/처리 방법 try-catch 및 throws (객관식)
 * ■ 난이도 : 중
 * [Q5] 다음은 수치 데이터(numeric data)를 문자열로 입력 받은 후, 정수형(integer type)으로 반환하는 예제이다.
 * 잘못된 데이터 입력을 방지하기 위해 예외 처리 기능을 포함시켰다. 올바른 실행 결과를 고르시오.
 * 답 : 실행 시 오류 발생
 */
public class HandleException {
	public static void main(String[] argv) {
		
		//String number; //전역변수 초기화 필요
		String number= "0";
		System.out.println(toInt(number));
		number = "9,900";
		System.out.println(toInt(number)); //0
		number = "10";
		System.out.println(toInt(number)); //10
	}

	public static int toInt(String strValue) {
		if (strValue == null || strValue.length() == 0) {
			throw new IllegalArgumentException();
		}
		int intValue = 0;
		try {
			intValue = Integer.parseInt(strValue);
		} catch (Exception e) {
			intValue = 0;
		}
		return intValue;
	}
}