
public class OpDemo {
	public static void main(String[] args) {
		//단항연산자
		int age = 26;
		//단항연산자 중 증감연산자 ++, -- : prefix operator, postfix operator
		// prefix : 덧셈을 먼저한 뒤 출력
		// postfix : 출력을 먼저하고 덧셈을 나중에
//		age++;	//++age; 라고 작성해도됨 but 앞에 쓰는거랑 뒤에 쓰는거랑 값이 달라짐(단독으로 쓸때는 상관없음)
//		age--;
		
//		System.out.println("age = " + age);
//		System.out.println("age = " + ++age);		//1증가해서 출력
//		System.out.println("age = " + age++);		//출력먼저 나중 증가
//		System.out.println("age = " + age);
		
		//보수연산자 ~
//		int su = 345678;
//		String result = Integer.toBinaryString(su);
//		System.out.println("result = " + result);
//		
//		int su1 = ~su;		// R-> L 이기 때문에 su를 ~처리해라는 뜻
//		result = Integer.toBinaryString(su1);
//		System.out.println("result = " + result);
//		System.out.println("su1 = " +  su1);
		
		//논리not연산자 !
//		boolean flag = 4>6;
//		System.out.println("flag = " + flag);
//		System.out.println("flag = " + !flag);
		
		// new : new 뒤에 있는애를 메모리에 초기화 = 객체를 인스턴스화
		//   		단항연산자
		
//		Student jimin = new Student();
		
		
		//형변환, Cast(size변화) or Convert(성질의 변화)
		//1. Cast Up, Promotion = 자동형변환, Implicit(암시적) Conversion
		double result = 5 + 3.14;	//int와 double 중에 더 큰쪽으로 따라가서(Cast Up) 맞춘 뒤 더함 -> 그래서 double 로 받아야함
		
		//2. Cast Down, Demotion, 강제형변환, Exxplicit(명시적) Conversion
		int result1 = (int)(5 + 3.14);		// ()안에 데이터타입을 넣어주면 됨
		// long result1 = (int)(5 + 3.14);	// 이것도 가능
	}
}
