package teacher;

public class StringFunctions {

	public static void main(String[] args) {
		String name="School1";
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('c'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" name is ABC "));
		String firstName="Manish";
		String lastName="Tiwari";
		System.out.println(firstName.concat(" ").concat(lastName));
		System.out.println(name.contains("@"));
		System.out.println(name.contains("sch"));




	}

}
