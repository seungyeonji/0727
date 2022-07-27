import java.util.Scanneer;
import java.util.Scanner;

public class RefDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");		// 이름 받아오기
		String name = sc.nextLine();		
		
		System.out.print("나이 : ");		// 나이 받아오기
		int age = sc.nextInt();		
		
		Student hojun = new Student();		// hojun 객체 생성
		hojun.name = name;		// 참조형 = 주소복사
		hojun.age = age;			// 값 복사
		
		System.out.println("호준의 이름 : " + hojun.name);
		System.out.println("호준의 나이 : " + hojun.age);
		
		
//		첫번째 방법 -> 방이 여러개면 귀찮음
//		Student jimin = new Student();
//		jimin.name = hojun.name;		// 주소 복사
//		jimin.age = hojun.age;		// 값 복사
		
// 		두번째 방법 -> 통째로 넘겨줌 = hojun 주소를 jimin이 참조 -> 첫번째 방법보다 편리		
		Student jimin = hojun;
		
		System.out.println("지민의 이름 : " + jimin.name);
		System.out.println("지민의 나이 : " + jimin.age);
	}
}
