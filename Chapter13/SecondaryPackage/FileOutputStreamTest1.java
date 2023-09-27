package SecondaryPackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamTest1 {


	public static void main(String[] args) throws IOException {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("저장 파일을 입력하세요 : ");
			String sfile = stdIn.next();
			
			// 파일명으로 객체 생성
						
			String str = "자바 프로그래밍 \n문자 스트림과 바이트 스트림 \n ";
			
			byte[]bt = str.getBytes();
			/*int i;
			for(i = 1; i <= 260; i++) {
				fos.write(i); // 파일에 내용 쓰기(저장)
			}*/
					
			fos.write(bt);
			
			
			fos.close();
			System.out.println("바이트 파일을 생성하였습니다.");
	}

	

}
