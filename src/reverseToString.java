public class reverseToString {
	public static void main(String args[]) {
	     
		String n="kaimur";
		char[] charArray=n.toCharArray();
		String reverse="  ";
		for(int i=charArray.length-1;i>=0;i--)
		{
			reverse=reverse+charArray[i];
		}
		System.out.println(reverse);
		
	}

}
