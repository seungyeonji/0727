import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("사원번호 : ");
		emp.empno = sc.nextInt();
//		sc.nextLine();    //enter 날리자
		
		System.out.print("사원이름 : ");
		emp.ename = sc.next();
		
		System.out.print("사원출생년도 : ");
		emp.birthYear = sc.nextInt();
		
		System.out.print("사원월급 : ");
		emp.salary = sc.nextInt();
//		sc.nextLine();    //enter 날리자
		
		System.out.print("사원이메일 : ");
		emp.email = sc.next();
		
		System.out.print("사원전화번호 : ");
		emp.tel = sc.next();
		
		System.out.print("정규직 : ");
		emp.flag = sc.nextBoolean();
		
		System.out.println("<<사원정보>>");
		System.out.println("사원번호 : " + emp.empno);
		System.out.println("사원이름 : " + emp.ename);
		System.out.println("사원나이 : " + (2022 - emp.birthYear));
		System.out.println("사원월급 : " + emp.salary + "만원");
		System.out.println("사원이메일 : " + emp.email);
		System.out.println("사원전화번호 : " + emp.tel);
		System.out.println("정규직 : " + emp.flag);

	
	}
}
