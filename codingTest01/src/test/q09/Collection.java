package test.q09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 배열과 컬렉션
 * ■ 소구분 : 배열의 활용 / 컬렉션의 활용 / generics / 배열과 컬렉션/Package (단답형)
 * ■ 난이도 : 중
 * [Q9] 다음 프로그램은 자바의 컬렉션 API 예제이다. 올바른 출력 결과를 기술하시오.
 * 답 : 1 1 2 3 (List 는 데이터 순서가 있고 중복이 가능하다)
 * 1 2 3 (Set은 데이터 순서가 없고 중복이 불가하다)
 */
public class Collection {
	List aList = new ArrayList();
	Set aSet = new HashSet();

	public static void main(String[] argv) {
		Collection collection = new Collection();
		collection.test();
		collection.print();
	}

	private void test() {
		int value = 1;
		addValue(value);  //1
		addValue(value);  //1
		value++;  //2
		addValue(value);  //2
		value++;  //3
		addValue(value);  //3
	}

	private void addValue(int value) {
		aList.add(value); //list = 1, 1, 2, 3
		aSet.add(value); //set = 1, 2, 3
	}

	private void print() {
		for (Object obj : aList) { //4개
			System.out.print(obj + " ");
		}
		System.out.println();
		for (Object obj : aSet) { //3개
			System.out.print(obj + " ");
		}
	}
}
