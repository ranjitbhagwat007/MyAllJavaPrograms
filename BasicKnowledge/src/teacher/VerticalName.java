package teacher;
public class VerticalName {
	static void reverseVerticalName()
	{
		String input="priya";
		for(int i=input.length()-1;i>=0;i--) {
			char a1=input.charAt(i);
			System.out.println(a1);
			//System.out.print(a1);
		}
	}
	public static void main(String[] args) {
		reverseVerticalName();
		System.out.println("--------");
		String input="priya";
		for(int i=0;i<input.length();i++)
		{   char a1=input.charAt(i);
			System.out.println(a1);
		}
	}
}
