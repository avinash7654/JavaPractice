import java.io.InputStream;

public class Scanner {
	public Scanner(InputStream in) {
		
	}

	public static void main(String[] args) {
	java.util.Scanner sc =new java.util.Scanner(System.in);	
		System.out.println("enter the name: ");
		String name=sc.next();
		System.out.println("enter the age: ");
		int age=sc.nextInt();
	System.out.println("enter the name: ");
		char Gender=sc.next().charAt(0);
		System.out.println("enter the number: ");
		long number=sc.nextLong();
		System.out.println("____");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("Gender:"+Gender);
		System.out.println("number:"+number);
		
	}

	public int nextint() {
		System.out.println("hello worl");
		return 0;
	}
}