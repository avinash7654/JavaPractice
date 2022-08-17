import java.util.Scanner;
public class Revers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name:");
		String b=s.nextLine();
		char [] charArray =b.toCharArray();
		String rev=" ";
		for(int i=charArray.length-1;i>=0;i--)
		{
			rev=rev+charArray[i];
			System.out.println(rev);
		}
		//System.out.println(rev);
		
	}

}
