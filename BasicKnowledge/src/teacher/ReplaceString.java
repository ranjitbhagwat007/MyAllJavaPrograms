package teacher;

public class ReplaceString {

	public static void main(String[] args) {
		String name="school1234";
		String op=name.replaceAll("[a-z]","");
		System.out.println(op);
		
		String name1="School123";
		String op1=name1.replaceAll("[A-Z]","");
		System.out.println(op1);
		
		String name2="School123";
		String op2=name2.replaceAll("[0-9]","");
		System.out.println(op2);
	}
	
	

}
