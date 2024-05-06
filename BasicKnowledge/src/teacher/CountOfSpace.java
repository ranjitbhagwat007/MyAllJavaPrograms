package teacher;

import java.util.Arrays;

public class CountOfSpace {

	static int countSpace=0;
	public static void main(String[] args) {
		String name="Manish 1 23";
		char[]c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isSpaceChar(c1[i]);
			if(answer==true) {
				countSpace++;
			}
		}
			System.out.println("The total no. of spaces are="+countSpace);
		
	}

}
