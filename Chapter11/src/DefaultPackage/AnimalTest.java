package DefaultPackage;
/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴퓨터소프트웨어공학부 202095041 배성윤
 * 설명 : 추상클래스 - 동물의 울음소리를 출력하자
 * 
 */

// 추상 클래스 - 동물
abstract class MyAnimal
{
	// 추상 메소드 : 동물의 소리를 반환하는 메서드
	// 추상메서드에는 따로 객체(바디)를 생성하는 것이 불가능하다. 즉, 메소드 자체를 선언하는 것만 가능하다.
	abstract String sound();
	
	// 일반 메소드 : 동물의 기본 정보 출력하는 메소드
	void displayInfo()
	{
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스 상속
// 고양이 울음소리 반환
class MyCat extends MyAnimal
{
	@Override
	String sound()
	{	// 재정의
		return "야옹!";
	}
	
	@Override 
	void displayInfo()
	{
		System.out.println("고양이 울음소리입니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		MyAnimal cat = new MyCat();
		
		cat.displayInfo(); // 재정의한 하위 클래스안의 매서드를 호출한다. 재정의한 메서드가 없으면 상위 클래스에 있는 메서드를 호출하게 된다. 
		System.out.println(cat.sound());
	}

}
