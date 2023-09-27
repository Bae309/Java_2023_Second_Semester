package SecondaryPackage;
/*
 * 작성일 : 2023년 9월 22일
 * 작성자 : 컴퓨터공학부 202095041 배성윤
 * 설명 : 문자를 파일에 쓰기(저장)
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleWriteTest1 {

	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일을 입력하세요 : ");
		String sfile = stdIn.next();
		
		// 파일에 저장할 문자열 생성
		String source = "What's your ETA \n" + "What's your ETA \n"; 
		
		// 파일명으로 객체 생성
		FileWriter fw = new FileWriter(sfile);
		
		// 문자열을 파일에 출력
		fw.write(source); // 객체를 통해 a.txt파일에 source에 있는 내용을 출력(저장)
		
		// 출력 스트림 닫기
		fw.close();
		
		System.out.println("파일이 생성되었습니다.");
	}

}
