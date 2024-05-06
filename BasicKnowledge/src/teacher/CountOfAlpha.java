package teacher;
import java.util.Arrays;
public class CountOfAlpha {
	static int countAlpha=0;
	public static void main(String[] args) {
		String name="Manish123";
		char[]c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			if(answer==true) {
				countAlpha++;
			}
		}
			System.out.println("The total no. of alphabets are="+countAlpha);
		
	}

}
