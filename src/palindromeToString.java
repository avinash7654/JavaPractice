
public class palindromeToString {

	public static void main(String[] args) {
	String s1= "mom";
	StringBuilder s=new   StringBuilder(s1);
	s.reverse();
	 
	String s2=s.toString();
	if(s1.equals(s2))
	{
		System.out.println("palindrome!!!");
		
	}
	else
	{
		System.out.println("not palindrome!!!!");
	}
	}

}
