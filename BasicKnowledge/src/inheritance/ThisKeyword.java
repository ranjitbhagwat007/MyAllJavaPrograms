package inheritance;

public class ThisKeyword {
	ThisKeyword()
	{
		System.out.println("one");
	}
	ThisKeyword(int a)
	{
		this(3.112);
		System.out.println("two");
	}
	ThisKeyword(double a)
	{	this();
		System.out.println("three");
	}
	public static void main(String[] args) {
		//ThisKeyword tk=new ThisKeyword();
		ThisKeyword tk=new ThisKeyword(3);

		
	}

}
