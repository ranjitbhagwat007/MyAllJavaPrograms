package BasicProgram;

public class NonStatic {
	void add() {
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	
	void sub() {
		int a=100;
		int b=200;
		System.out.println(b-a);
	}
	public static void main(String[] args) {
      NonStatic n1=new NonStatic();
      n1.add();
      n1.sub();
      }

}
