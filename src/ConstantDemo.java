
public class ConstantDemo {
	public static void main(String[] args) {
		final int age = 26;	// final -> 상수 선언해줬기 때문에 값 고정
		System.out.println("age = " + age);
//		age = 36; -> final 해준 뒤에 값 변경시키면 오류남
		System.out.println("age = " + age);
	}
}
