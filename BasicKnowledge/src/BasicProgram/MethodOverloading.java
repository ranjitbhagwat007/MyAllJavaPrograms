package BasicProgram;

public class MethodOverloading {
	void add() 
	{
	int a=100;
	System.out.println(a+6);
	}
	void add(int a) 
	{
	System.out.println(a+6);
	}
	void add(int a, double b) 
	{
	System.out.println(a+6);
	}
	void add(int a, double b,String c) 
	{
	System.out.println(a+6);
	}
	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		m1.add();
		m1.add(100,100.1);
		m1.add(100,100.1,"okay");
	}

}
