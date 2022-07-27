
public class HelloWorld4 {
	public static void main(String[] args) {
		System.out.println("msg = " + Demo.msg);	//member variable 아니니까 new로 만들지 않았음(주소로 접근하지 않음)
																	//msg의 소속을 가르쳐줘야함 -> class 이름으로 접근 : Class Variable
	}
}

class Demo{
	static String msg = "Hello, World";
}
