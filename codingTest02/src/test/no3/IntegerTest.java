package test.no3;
/**
 * ���ڸ� �Է¹޾�, �Ųٷ� ����Ѵ�.
 * ex) �Է� : 3560 -> ��� : 653
 */
public class IntegerTest {

	public int test03(int num) {
		String st = Integer.toString(num);
		String[] str = st.split("");
		StringBuffer bf = new StringBuffer();
		for(int i = str.length; i > 0 ; i--) {
			bf.append(str[i-1]);
		}
		st = bf.toString();
		int result = Integer.parseInt(st);
		
		return result;
	}
	
	public static void main(String[] args) {
		IntegerTest test = new IntegerTest();
		int result = test.test03(3560);
		System.out.println(result);
	}

}
