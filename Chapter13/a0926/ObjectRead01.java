package a0926;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class ObjectRead01 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner stdin = new Scanner(System.in);
		System.out.println("입력 파일명을 입력하세요 : ");
		String fileName = stdin.next();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
		
		Object s2 = ois.readObject();
		
		PersonInfo p1 = (PersonInfo)ois.readObject();
		PersonInfo p2 = (PersonInfo)ois.readObject();
		
		System.out.println(s2);
		System.out.println("이름 : " + p1.name);
		System.out.println("주소 : " + p1.city);
		System.out.println("나이 : " + p1.age);
		System.out.println("-------------------");
		System.out.println("이름 : " + p2.name);
		System.out.println("주소 : " + p2.city);
		System.out.println("나이 : " + p2.age);
	}

}
