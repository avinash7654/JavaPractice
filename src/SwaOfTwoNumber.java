import java.util.Scanner;

public class SwaOfTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		
		Scanner in= new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+":::::"+b);

	}

}
