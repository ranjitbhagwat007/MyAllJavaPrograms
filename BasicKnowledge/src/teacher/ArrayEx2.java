package teacher;

public class ArrayEx2 {

	public static void main(String[] args) {
		int nos[]=new int[4];
		nos[0]=415;
		nos[1]=42;
		nos[2]=41;
		nos[3]=414;
		int givenNo=41;
		for(int i=0;i<nos.length;i++)
		{
			if(givenNo==nos[i])
			{
				System.out.println("Number is present in given array at index position "+i);
			}
			else {
				System.out.println("Number is present in given array at index position "+i);
			}
		}
	}

}
