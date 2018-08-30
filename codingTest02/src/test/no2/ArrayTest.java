package test.no2;
/**
 * 배열에 들어있는 두 개의 숫자의 합이 9인 경우 새로운 배열에 두 숫자를 담아서 리턴한다.
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
		System.out.println("0번지 숫자는 : "+a[0]+", 1번지 숫자는 : "+a[1]);
	}

}
