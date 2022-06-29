
public class CapitalizeeachFirstCharOfWord {

	public static void main(String[] args) {

		String input = "this is point";

		String[] splitted = input.split(" ");
		String cappitalWord = "";

		for (String s : splitted) {

			String first = s.substring(0, 1);

			String AfterFirst = s.substring(1);

			cappitalWord = cappitalWord + first.toUpperCase() + AfterFirst + " ";

		}

		System.out.println(cappitalWord);

	}

}
