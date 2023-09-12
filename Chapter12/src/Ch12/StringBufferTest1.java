package Ch12;
/*
 * 작성일 : 2023년 9월 12일
 * 작성자 : 202095041 컴퓨터소프트웨어공학부 배성윤
 * 설명 : StringBuffer의 활용
 */
public class StringBufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer( "Hello, Java " );
		StringBuffer sb2 = new StringBuffer( "처음 시작하는 자바 " );
		System.out.println("문자열 => " + sb1);
		System.out.println("문자열 길이 => " + sb1.length());
		System.out.println("버퍼를 포함한 길이 => " + sb1.capacity()); // 버퍼를 포함하여 배정된 공간을 출력
		System.out.println("버퍼에 들어있는 내용 => " + sb2);
		System.out.println("문자열 끼워넣기 => " + sb2.insert(8, "Power ")); //문자열 중간에 문자열을 삽입
		System.out.println("버퍼의 8번째 문자 => " + sb2.charAt(8));
		sb2.setCharAt(5, '되'); // 특정 위치의 값을 바꾼다
		System.out.println("5번째 값을 '되'로 변경 => " + sb2);
		sb2.setLength(5); // 문자열의 길이를 고정
		System.out.println("버퍼의 새로운 값 => " + sb2);
		System.out.println("문자열의 역순출력하기 => " + sb2.reverse()); // 문자열을 역순으로 출력

	}

}
