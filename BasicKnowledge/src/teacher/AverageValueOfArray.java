package teacher;

public class AverageValueOfArray {
	static double average=0;
	static int sum=0;
	public static void main(String[] args) {
		int number[]=new int[4];
		number[0]=41;
		number[1]=42;
		number[2]=43;
		number[3]=44;
		
		for(int i=0;i<number.length;i++) {
			
			sum=sum+number[i];
			average=sum/number.length;
			//average=sum%(number.length);
			System.out.println(sum);
			System.out.println(average);

		}
	}

}
