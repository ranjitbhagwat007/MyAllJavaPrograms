package inheritance;

public class ThisKey {
	ThisKey()
	{   this(100);
		System.out.println("one");
	}
	ThisKey(int a)
	{	this("ok");
		System.out.println("two");
	}
	ThisKey(String a)
	{	this('a',"jeet");
		System.out.println("three");
	}
	ThisKey(char a, String b)
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		ThisKey tk=new ThisKey();
	}

}
