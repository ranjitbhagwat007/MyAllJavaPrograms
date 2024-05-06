package BasicProgram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		int num1=s1.nextInt();
		int num2=s1.nextInt();
		int sum=num1+num2;
		System.out.println("The sum of two numbers is " +sum);
	}

}
