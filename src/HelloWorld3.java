
public class HelloWorld3 {
	//String str = "Hello, World";		//Member Variable or Instance Variable
	static String str = "Hello, World";	//Static Variable or Class Variable : 주소없이 접근 가능
													// -> main이 시작하기 전에 먼저 올라옴
	
	public static void main(String[] args) {
		//String str = "Hello, World";		//Local Variable
		System.out.println("str = " + str);
	}
}
