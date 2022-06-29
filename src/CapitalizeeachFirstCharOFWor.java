
public class CapitalizeeachFirstCharOFWor {
	public static void main (String args[]) {
		String input="my name is avinash";
		String[] splitted=input.split(" ");
		String cappitelwor=" ";
		for(String s:splitted)
		{
			String First=s.substring(0,1);
			String AfterFirst=s.substring(1);
			cappitelwor=cappitelwor+First.toUpperCase()+AfterFirst+" ";
		}
		System.out.println(cappitelwor);
	}

}
