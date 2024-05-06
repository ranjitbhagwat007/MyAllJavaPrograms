package teacher;

public class Assert2 {

	public static void main(String[] args) {
		String name="";
		assert name.length()>0:"The length is 0 or less";  //alternate syntax of assert
		System.out.println(name.concat("jatin")); 
		
		/*public static void main(String[] args) {
			String name="ram";
			assert name.length()>0;
			System.out.println(name.concat(" jatin"));*/
		
		
		
	}
}
