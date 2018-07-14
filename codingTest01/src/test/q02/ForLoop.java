package test.q02;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 기초문법
 * ■ 소구분 : 조건문/반복문/연산자 (단답형)
 * ■ 난이도 : 하
 * [Q2] 다음 반복 테스트(loop test) 클래스의 실행 결과를 적으시오.
 */
public class ForLoop { //무한루프
	public static void main(String[] argv) {
		int total = 0;
		for (int i = 1; i <= 5; i++) { //5번
			for (int j = 1; j <= i; i++) { //j=1; 1<=1; 2 > 1; 1<=2; 3 ...
				total++;
			}
		}
		System.out.println(total);
	}
}
