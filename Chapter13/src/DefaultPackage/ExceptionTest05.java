package DefaultPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.println((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 안에 내용이 없거나 읽어올 수 없습니다.");
			//e.printStackTrace();
		}
	}
	
}
