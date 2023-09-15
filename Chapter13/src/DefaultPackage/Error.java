package DefaultPackage;
/*
 * 작성자 : 컴퓨터소프트웨어공학부 202095041 배성윤
 * 작성일 : 2023.09.15
 * 설명 : 예외처리
 */
public class Error {

	public static void main(String[] args) {
		x();

	}
	
	static void x()
	{
		y();
	}
	
	static void y()
	{
		z();
	}
	
	static void z()
	{
		int i = 1;
		int j = 0;
		System.out.println(i/j);
	}

}
