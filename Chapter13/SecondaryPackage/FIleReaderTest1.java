package SecondaryPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴퓨터공학부 202095041 배성윤
 * 설명 : 파일에 저장된 내용 가져오기
 */

public class FIleReaderTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		try {
			System.out.print("읽을 파일을 입력하세요 : ");
			String sfile = stdIn.next(); // 문자열로 입력된 파일명 저장
			
			// 읽어들일 파일명으로 객체 생성
			FileReader fr = new FileReader(sfile);
			
			// 한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) { // 데이터를 모두 읽으면 -1 반환
				System.out.print((char)i);
			}
			
			fr.close();
			
		} catch (FileNotFoundException e) { // 예외처리 필수
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽어들일 파일이 없습니다.");
			e.printStackTrace();
		}
	}

}
