
public class HelloWorld2 {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("str = " + t.str);		// 내가 쓰려고 하는 변수가 다른 클래스에 속해있다면 속해있는 클래스의 주소로 접근
	}
}

class Test{
	String str = "Hello, World";		// member variable
}