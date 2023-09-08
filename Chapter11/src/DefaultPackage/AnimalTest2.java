package DefaultPackage;

/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴퓨터소프트웨어공학부 202095041 배성윤
 * 설명 : 추상클래스 - 동물의 울음소리를 출력하자
 * 		클래스 메소드
 */

// 추상 클래스 - 동물
abstract class MyAnimal2
{
	// 추상 메소드 : 동물의 소리를 반환하는 메서드
	// 추상메서드에는 따로 객체(바디)를 생성하는 것이 불가능하다. 즉, 메소드 자체를 선언하는 것만 가능하다.
	abstract String sound2();
	
	// 클래식 메소드 : 동물의 기본 정보 출력하는 메소드
	static void displayInfo2()
	{
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스 상속
// 고양이 울음소리 반환
class MyCat2 extends MyAnimal2
{
	@Override // 오버라이딩을 제대로 했는지 확인해준다.
	String sound2()
	{	// 재정의
		return "야옹!";
	}
	
	// 클래스 메서드(정적 메서드)의 경우 오버라이딩할 수 없다. 
	
	static void displayInfo2()
	{
		System.out.println("고양이 울음소리입니다.");
	}
}

public class AnimalTest2 {

	public static void main(String[] args) {
		MyAnimal2 cat = new MyCat2();
		
		cat.displayInfo2(); // 재정의한 하위 클래스안의 매서드를 호출한다. 재정의한 메서드가 없으면 상위 클래스에 있는 메서드를 호출하게 된다. 
		System.out.println(cat.sound2());
	}

}
