package DefaultPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 작성자 : 배성윤
 * 작성일 : 2023.09.15
 * 2개의 정수를 입력받아 나눗셈하는 프로그램
 */
public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = Integer.parseInt(stdIn.next()); //문자형으로 변환
		System.out.print("두번째 숫자 입력 : " );
		int num2 = stdIn.nextInt();
		
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			//System.out.println("해당 예외 : " + e);
			//e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("첫번째 줄은 숫자만 입력하시오 : ");
			//System.out.println("해당 예외 : " + e);
		} catch (InputMismatchException e) {
			System.out.println("두번째 줄은 숫자만 입력하시오 : ");
		} catch (Exception e) {
			System.out.println("에외가 발생되었습니다.");
		} finally { //생략 가능
			System.out.println("프로그램 종료");
		}

	}

}
