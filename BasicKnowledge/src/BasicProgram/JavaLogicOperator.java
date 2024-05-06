package BasicProgram;

public class JavaLogicOperator {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if (a>6 || a==b) {
			System.out.println("one");
		}
		if (a>6 && a==b) {
			System.out.println("two");
		}
		if (!(a>6 || a!=b)){
			System.out.println("one");
		}
		if (!(a>6 && a!=b)){
			System.out.println("two");
		}
	}

}
