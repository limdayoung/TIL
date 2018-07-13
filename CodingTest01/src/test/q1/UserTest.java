package test.q1;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.13
 * ■ 대구분 : Java API
 * ■ 소구분 : Object class/String class/StringBuffer/Wrapper (단답형)
 * ■ 난이도 : 중
 * [Q1] 다음 프로그램은 간단한 회원 정보를 포함하고 있는 클래스를 작성한 것이다. 실행 결과를 적으시오.
 */

public class UserTest {
	public static void main(String[] argv) {
		new UserTest().compare();
	}

	private void compare() {
		User a = new User("J", "Lee");
		User b = new User("J", "Lee");
		User c = a;
		System.out.println(a == b); //false 주소값 비교, 서로다른 주소값
		System.out.println(a == c); //true 주소값 비교, c에 a를 대입했기떄문에 같은 주소값 
		System.out.println(a.equals(b)); //
	}

	public class User { //innerClass
		private String firstName;
		private String lastName;

		public User(String firstName, String lastName) { // J, Lee
			this.firstName = new String(firstName);
			this.lastName = new String(lastName);
		}

		public boolean equals(User other) { // a와 b 비교
			return match(firstName, other.firstName) || match(lastName, other.lastName);
			//false || false -> false
		}
		
		/*
		 * equals() : 대상의 내용 자체를 비교
		 * == : 대상의 주소값을 비교
		 */
		private boolean match(String part1, String part2) { //J, J / Lee, Lee
			return part1 == part2 && part1.equals(part2);  //false && true -> false
		}
	}
}