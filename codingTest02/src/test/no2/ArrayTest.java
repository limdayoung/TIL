package test.no2;
/**
 * �迭�� ����ִ� �� ���� ������ ���� 9�� ��� ���ο� �迭�� �� ���ڸ� ��Ƽ� �����Ѵ�.
 */
public class ArrayTest {

	public int[] test02(int[] num) {
		
		for (int i=0; i < num.length; i++) {
			for(int a=0; a < num.length; a++) {
				if(i!=a & num[i]+num[a]==9) {
					int[] array = {num[i], num[a]};
					System.out.println(array[0]+"  "+array[1]);
					return array;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		ArrayTest test = new ArrayTest();
		int [] num = {1,2,5,4};
		int [] a = test.test02(num);
		System.out.println("0���� ���ڴ� : "+a[0]+", 1���� ���ڴ� : "+a[1]);
	}

}
