
public class CopyDemo {
	public static void main(String[] args) {
		int original = 26;
		int target = original;		// 값 복사(original에 있는 값을 target에 넣어라)
		System.out.println("Before Change");
		System.out.println("original's value = " + original);
		System.out.println("target's value = " + target);
				
		original = 36;
		System.out.println("After Change");
		System.out.println("original's value = " + original);
		System.out.println("target's value = " + target);	// target의 값은 바뀌지 않음 <- 연결(link)되어 있지 않기 때문에
		
		
	}
}
