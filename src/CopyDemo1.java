
public class CopyDemo1 {
	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.price = 25_000_000;
		
		
		Car matiz = new Car();
		matiz.price = sonata.price;		// 값 복사 -> price가 복사된거기 때문에 int인 price 값이 복사된거
		
		System.out.println("Before Change");
		System.out.println("Sonata's price : " + sonata.price);
		System.out.println("Matiz's price : " + matiz.price);
		
		System.out.println("After Change");
		sonata.price = 100_000_000;		// sonata의 price값만 바뀜
		System.out.println("Sonata's price : " + sonata.price);
		System.out.println("Matiz's price : " + matiz.price);

	}
}

class Car{
	int price;
	
}
