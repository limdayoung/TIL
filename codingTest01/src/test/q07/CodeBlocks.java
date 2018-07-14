package test.q07;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 객체와 클래스
 * ■ 소구분 : 객체 생성과 사용 / Class선언 / 생성자접근제한자 / 기타제한자(Static, Final, Abstract) (단답형)
 * ■ 난이도 : 상
 * [Q7] 아래 프로그램의 예상되는 출력 결과를 적으시오.
 * 답 : A ABCD BCD
 */
public class CodeBlocks {
	private static String aField = "";
	private String bField = "";
	
	//main 메소드보다 먼저 실행되는 static 구문
	static {
		aField += "A"; //A
	}
	{
		aField += "B"; //AB
		bField += "B"; //B
	}

	public CodeBlocks() {
		aField += "C";
		bField += "C"; //BC
	}

	public void append() {
		aField += "D"; //ABCD
		bField += "D"; //BCD
	}

	public static void main(String[] argv) {
		System.out.println(aField); //A / static 구문만 실행
		CodeBlocks cb = new CodeBlocks();
		cb.append();  // static구문 + {}구문 + append() 실행
		System.out.println(aField); // ABCD
		System.out.println(cb.bField); //BCD / append() 실행 후
	}
}
