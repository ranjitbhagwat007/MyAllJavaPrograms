package teacher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try {
			int age= s1.nextInt();
			System.out.println(age);
		}
		catch(InputMismatchException e) {
			
		}finally {
			System.out.println("ok");
		}
	}

}
