package Ch12;

class TestTest{
	private String text;
	public TestTest(String s) 
	{
		this.text = s;
	}
}

public class Test2 {
	public static void main(String[] args) {
		TestTest test = new TestTest("ABC");
		//System.out.println(test.text.toLowerCase(1)); //text가 private로 선언되어 있어서 불러올수 없음
	}
}
