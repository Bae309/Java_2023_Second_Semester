package B_Package;
import A_Package.Test1;
// import A_Package.*

/*
 * 작성일 : 2023년 9월 12일
 * 작성자 : 202095041 컴퓨터소프트웨어공학부 배성윤
 * 설명 : 패키지의 활용
 */

public class Test2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1(); // A_Package에 있는 클래스로부터 객체를 생성
		System.out.println(t1.sum(10, 20)); // A_Package의 Test1 클래스 호출
	}

}
