
public class HelloWorld1 {
	// 특정 블록(메소드)에 속해있지 않는 경우 -> 지역변수 x
	String str = "Hello, World";		// Member Variable or Instance Variable : 생성시점은 HelloWorld1 class 를 만들때
											// HelloWorld1 클래스 소속
	
	public static void main(String[] args) {
		// Local Variable (지역변수) : 자기가 속해있는 블록(선언된 블록 = main)에서만 사용할 수 있는 변수
		// 생성, 소멸에 대해 고민할 필요가 없음(C언어의 Auto Variable) -> Scope 또는 Life Cycle 관점에서 연결 가능
		// String str; -> 오류발생 : 사용하기전에 무조건 초기화해야함
		
		// String str = "Hello, World";
		HelloWorld1 hw = new HelloWorld1();	// HelloWorld1에 속해있는 str이 들어갈수있는 집을 만들어줌
		// System.out.println("str = " + str);
		
		
		// int age; 	local variable
		
	}
}
