package BasicProgram;

public class GlobalVariable {
		static int age=10;
		static String name="jeet";
		static int a;
		int b=30;//non static global variable
		static void age(){
			System.out.println("one");
		}
	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(name);
		name="manish";
		System.out.println(name);
		a=20;
		System.out.println(a);
		GlobalVariable G1= new GlobalVariable();//by creating new obj we can the non static global varaible
		System.out.println(G1.b);
	}

}
