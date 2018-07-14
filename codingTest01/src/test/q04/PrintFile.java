package test.q04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 작성자 : 임다영
 * 작성일 : 2018.07.14
 * ■ 대구분 : 예외처리
 * ■ 소구분 : Exception 카테고리/처리 방법 try-catch 및 throws (단답형)
 * ■ 난이도 : 상
 * [Q4] 다음은 프로그래밍 도중 자주 사용되는 File 입출력(Input / Output) 예제이다.
 * 텍스트 파일을 읽어 들여 내용을 화면에 출력하고 있다.
 * 아래 코드 중 예외 처리 부분의 리소스 유출(resource leak) 가능성을 확인하고올바른 코드를 적으시오.
 * inputStream.close(); 구문을 catch블럭에서 finally 블럭으로 이동
 */
public class PrintFile {
	public static void main(String[] argv) {
		try {
			new PrintFile().print("C:\\Users\\ldy\\git\\TIL\\codingTest01\\src\\test\\q4\\hello.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void print(String filePath) throws IOException {
		File inputFile = new File(filePath);
		InputStream inputStream = new FileInputStream(inputFile);
		try {
			while (inputStream.available() > 0) {
				System.out.print((char) inputStream.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			inputStream.close();
		}
	}
}