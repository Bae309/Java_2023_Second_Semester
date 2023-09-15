package DefaultPackage;

import java.util.Scanner;

/*
 * 작성자 : 배성윤
 * 작성일 : 2023.09.15
 * 2개의 정수를 입력받아 나눗셈하는 프로그램
 */
public class ExceptionTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = stdIn.nextInt();
		System.out.print("두번째 숫자 입력 : " );
		int num2 = stdIn.nextInt();
		
		System.out.println(num1 / num2);

	}

}
