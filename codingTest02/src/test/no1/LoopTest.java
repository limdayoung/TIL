package test.no1;
/**
 * 27���� 85������ ���ӵ� ������ ���� ���Ѵ�.
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
