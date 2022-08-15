import java.util.Scanner;

public class SwapingToNumber {
	public static void main(String[] args) {
		System.out.println("enter number:");
		Scanner  s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
	//	System.out.println(a+":::"+b);
	}

}
