package test.q06;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : Data Type
 * ■ 소구분 : Java data / Primitive / Reference type / Call by value (단답형)
 * ■ 난이도 : 중
 * [Q6] 아래 프로그램의 출력 결과를 적으시오.
 * 답 : Hello, 0, 1.0
 */
public class SetValues {
	public static void main(String[] argv) {
		String stringObj = "Hello";
		int intValue = 0;
		Float floatObj = new Float(1.0);
		
		setValues(stringObj, intValue, floatObj);
		
		System.out.println(stringObj + ", " + intValue + ", " + floatObj);
		// Hello, 0, 1.0
	}
	
	/*
	 * 메소드 리턴값 없음
	 */
	private static void setValues(String strValue, int intValue, Float floatObj) {
		strValue.replace("H", "h");
		strValue += " World";
		intValue = 99;
		floatObj.valueOf((float) 2.0);
	}
}
