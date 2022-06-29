import java.util.Arrays;

public class AnagramStringChar {
	public static void main(String[] args) {
		String a1="listen";
		String a2="s          ilent";
		boolean status= true;
	//	chack length of string
		if(a1.length()!=a2.length());
		{
			status=false;
		}
	//	converting string to char[]
		
		{
			char [] a1_array=a1.toCharArray();
			char [] a2_array=a2.toCharArray();
			//to sorting
			Arrays.sort(a1_array);
			Arrays.sort(a2_array);
	// equals  method
			
			status=Arrays.equals(a1_array, a2_array);
			
		}
		if(status)
		{
			System.out.println("anagram String !!");
		}
		else
		{
		System.out.println("not anagram String !!");	
		}
	}

}
