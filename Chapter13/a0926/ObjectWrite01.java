package a0926;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * 작성일 : 2023.09.26
 * 작성자 : 202095041 배성윤
 */
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.Scanner;

// 이 클래스를 직렬화할 것을 지정
class PersonInfo implements Serializable {
	String name; // 멤버변수
	String city;
	int age;
	
	// 생성자
	public PersonInfo(String name, String city, int age) {
		this.name = name; // 매개변수로 전달받은 값을 멤버 변수에 저장
		this.city = city;
		this.age = age;
	}
}

public class ObjectWrite01 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner stdin = new Scanner(System.in);
		System.out.println("출력 파일명을 입력하세요 :");
		String fileName = stdin.next();
		
		String s1 = "***고객 정보***";
		
		// 직렬화된 객체를 2개 생성
		PersonInfo p1 = new PersonInfo("배성윤", "양산", 24);
		PersonInfo p2 = new PersonInfo("Streetman", "Georgia", 25);
		
		// 직렬화된 객제를 2진수로 지록한 파일을 저장
		// 객체를 기록할 수 있는 ObjectOutputStream 객체 생성
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		// 직렬화된 객체를 파일에 2진수로 기록한다.
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		System.out.println(fileName + " 파일명으로 객체 파일을 생성하였습니다.");
	}

}
