package SecondaryPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴퓨터공학부 202095041 배성윤
 * 설명 : 파일에 저장된 내용 가져오기
 */
public class FIleInputStramTest1{
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("읽을 파일을 입력하세요 : ");
		String sfile = stdIn.next(); // 문자열로 입력된 파일명 저장
		
		// 읽어들일 파일명으로 객체 생성
		FileInputStream fis = new FileInputStream(sfile);
		
		// 한 바이트씩 읽기
		int i;
		while((i = fis.read()) != -1) { // 데이터를 모두 읽으면 -1 반환
			System.out.print((char)i);
		}
		
		fis.close();
		System.out.println(sfile + "파일로 부터 바이트 단위를 읽어 화면에 출력완료 했습니다.");
	}
}
