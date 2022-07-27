
public class HelloWorld7 {
	public static void main(String[] args) {
		Busan bu = new Busan();
		bu.display();
	}
}

class Busan{
	void display() {	//member method -> 주소로 접근(line 4)
		System.out.println("Hello, World");
	}
}