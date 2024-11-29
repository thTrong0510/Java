package First_code;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		//format %d số nguyên, %f số thực mặc định là 6 số sau dấu ',' %.3f 3 số, %s chuỗi
		System.out.printf("Toi %d tuoi", 20);
		
		//Scanner 
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhan %s cua ban: ", "ten");
		String name = scanner.nextLine();
		scanner.close();
		
		//hàm toán học object Math
		System.out.println(Math.max(10, 5));
	}
}
