package test.q10;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 객체와 Class
 * ■ 소구분 : 객체 생성과 사용 / Class선언 / 생성자 / 접근제한자 / 기타제한자(Static, Final, Abstract) (객관식)
 * ■ 난이도 : 중
 * [Q10] 아래 예제 프로그램은 컴파일 시 오류가 발생한다. 코드 중에서 문법 오류가 발생하는 라인을 고르시오.
 * 답 : 변수에 static을 사용할때는 전역변수에서만 가능하다.
 */
public class AboutPerson {
	public static void main(String[] argv) {
		//static int argvCount = argv.length;
		/*Person a = new Person();
		a.setAge(10);
		a.setName("Alice");
		Person b = new Person();
		b.age = 10;
		a.name = "John";
		print(a);
		print(b);*/
	}

	private static void print(Person p) {
		System.out.println("name : " + p.name + ", age : " + p.age);
	}

	class Person {
		private String name;
		private int age;

		public Person() {
		}

		public Person(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public String setName(String name) {
			return this.name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
}
