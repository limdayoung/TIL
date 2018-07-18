package test.q14;

import java.io.IOException;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.19
 * ■ 대구분 : 예외처리 
 * ■ 소구분 : Exception 카테고리/처리 방법  try-catch 및 throws (단답형)
 * ■ 난이도 : 상
 * [Q14] 다음은 예외 처리 예제이다. 예상되는 실행 결과를 적으시오.
 * 답 : 
 * execute finally block
 * Exception in thread "main" test.q14.HandleException2$IllegalParamException: Invalid input age : -10
 * 
 * 해설 : 
 * RuntimeException은 명시적으로 catch하지 않을 경우, catch블록을 통과하게 된다.
 */
public class HandleException2 {

	public static void main(String[] argv) {
		new HandleException2().test();
	}

	private void test() {
		try {
			Person person = new Person("John", -10);
		} catch (IOException e) {
			System.out.println("Exception catched");
		} finally {
			System.out.println("execute finally block");
		}
	}

	public class Person {
		private String name;
		private int age;

		public Person(String name, int age) throws IOException {
			if (age < 0)
				throw new IllegalParamException("Invalid input age : " + age);
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public class IllegalParamException extends RuntimeException {
		public IllegalParamException(String msg) {
			super(msg);
		}
	}
}

