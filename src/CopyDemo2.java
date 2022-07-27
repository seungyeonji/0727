
public class CopyDemo2 {
	public static void main(String[] args) {
		Product mouse = new Product();
		mouse.price = 20000;
		
		Product keyboard = mouse;		// mouse의 주소를 keyboard에 할당 -> 주소 복사
		
		System.out.println("Before Change");
		System.out.println("mouse's price : " + mouse.price);
		System.out.println("keyboard's price : " + keyboard.price);
		
		System.out.println("After Change");
		mouse.price = 100000;
		System.out.println("mouse's price : " + mouse.price);
		System.out.println("keyboard's price : " + keyboard.price);		// 주소 복사했기 때문에 mouse 가격 바꾸면 keyboard 가격도 같이 바뀜

	}
}

class Product{
	int price;
}
