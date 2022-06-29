import java.util.Arrays;

public class AnagramString {
	public static void main(String args[])
	{
		String s1="keep";
		String s2="peek";
		boolean status=true;
		
		//checking the length of string
		if(s1.length()!=s2.length()) {
			status=false;      
			
		}else {
			char [] s1_array=s1.toCharArray();
			char [] s2_array=s2.toCharArray();
			// sorting of array
			Arrays.sort(s1_array);
			Arrays.sort(s2_array);
			
			//checking equals of character array
			
			status=Arrays.equals(s1_array, s2_array);
			
			
		}
		
		if(status) {
			System.out.println("Anagram String!!!");
			
		}
		else {
			
			System.out.println("Not Anagram String!!!");
		}
		
		
		
		
		
	}

}
