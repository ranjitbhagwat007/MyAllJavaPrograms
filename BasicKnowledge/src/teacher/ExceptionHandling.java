package teacher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
	try {
		
		int age= s1.nextInt();
		System.out.println(age);
	}catch(InputMismatchException e1) {	
		System.out.println("Handled e1");
	}catch(NullPointerException e2) {	
		System.out.println("Handled e2");
	}catch(IndexOutOfBoundsException e2) {	
		System.out.println("Handled e3");
	}
	}

}
