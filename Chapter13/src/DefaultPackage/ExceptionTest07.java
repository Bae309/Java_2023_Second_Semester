package DefaultPackage;

import java.util.Scanner;

/*
 * 나이를 입력받아 출력하시오
 * 입력받은 나이가 전수가 아닌 경우 예외처리 하시오
 */
public class ExceptionTest07 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 : ");
		
		int age = 0;
		try
		{
			age = sc.nextInt();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
		}
		
		catch(Exception e)
		{
			System.out.println("정수를 입력하여 주시기 바랍니다.");
		}
		*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 : ");
		
		int age = 0;
		try
		{
			age = sc.nextInt();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
		}
		
		catch(Exception e)
		{
			System.out.println("정수를 입력하여 주시기 바랍니다.");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 : ");
		
		int age = 0;
		try
		{
			age = sc.nextInt();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
		}
		
		catch(Exception e)
		{
			System.out.println("정수를 입력하여 주시기 바랍니다.");
		}
	}

}
