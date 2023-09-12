package Ch12;
/*
 * 작성일 : 2023년 9월 12일
 * 작성자 : 202095041 컴퓨터소프트웨어공학부 배성윤
 * 설명 : 단축 초기화 String과 New 연산자를 통해 생성된 String
 */
public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "Java Korea"; // 단축 초기화 문자열로 생성
		String s2 = new String("Java Korea"); // new 연산자를 통해 문자열로 생성
		String s3 = s2.intern();  // 단축 초기화 문자열로 변경해주는 메서드
		String s4 = "Java Korea";
		String s5 = new String("Java Korea");
		System.out.println("s1과 s2가 같은 장소? : " + (s1 == s2)); // false
		System.out.println("s1과 s2의 값이 같은가? : " + (s1.equals(s2))); // true
		System.out.println("s1과 s3가 같은 장소? : " + (s1 == s3)); // true
		System.out.println("s2와 s5가 같은 장소? : " + (s2 == s5)); // false
		System.out.println("s2와 s5가 값이 같은가? : " + (s2.equals(s5))); // true
						
	}

}
