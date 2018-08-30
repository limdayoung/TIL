package test.no1;
/**
 * 27부터 85까지의 연속된 숫자의 합을 구한다.
 */
public class LoopTest {
	
	int num;
	
	public int test01() {
		for(int i = 27; i<86; i++) {
			num +=i;
		}
		return num;
	}
	
	public static void main(String[] args) {
		LoopTest test = new LoopTest();
		System.out.println(test.test01());
	}
}
