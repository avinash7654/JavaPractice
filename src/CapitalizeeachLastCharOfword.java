public class CapitalizeeachLastCharOfword {
	public static void main(String args[]) {
		String input= "this is a pen";
		String [] spiltted=input.split(" ");
		String result=" ";
		for(String b:spiltted)
		{
			String Last=b.substring(b.length()-1);
			String BeforeLast=b.substring(0,b.length()-1);

		result=result+BeforeLast+Last.toUpperCase()+" ";
		
		}
			System.out.println(result);
	}
	
	
	
	

}
