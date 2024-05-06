package teacher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		//int n1= s1.nextInt();

		
		try {
			int n1= s1.nextInt();
			String name[]= new String[n1];
			name[0]="Ram";
			name[1]="Sita";
			name[2]="Laxman";
			name[3]="Hanuman";

			System.out.println(name);
		}catch(InputMismatchException e1) {	
			System.out.println("Handled e1");
		}catch(NullPointerException e2) {	
			System.out.println("Handled e2");
		}catch(IndexOutOfBoundsException e3) {	
			System.out.println("Handled e3");
		}
		}
}