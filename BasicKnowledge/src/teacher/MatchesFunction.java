package teacher;

public class MatchesFunction {

	public static void main(String[] args) {
		String match="Manish";
		System.out.println(match.matches("M(.*)"));//starts with M
		System.out.println(match.matches("(.*)h"));//ends with h
		String input="Malik";
		System.out.println(input.matches("....."));//checks the string contains 5 characters or not
		String a1="School";
		int a2= a1.lastIndexOf('o');
		System.out.println(a2);
	}

}
