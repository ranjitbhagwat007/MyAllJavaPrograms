package teacher;

public class StringArrayRemovesNumeric {

	public static void main(String[] args) {
		String input="school123";
		String output= input.replace('o', ' ');
		System.out.println(output);
		
		String output1= input.replace('o','m');
		System.out.println(output1);
	}

}
