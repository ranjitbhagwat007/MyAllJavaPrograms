package BasicProgram;
class Parent{
	static void add() {
		System.out.println("ok");
	}
	void sub() {
		System.out.println("1");
	}
}
public class Child extends Parent
{

	public static void main(String[] args) {
		add();
		Child c=new Child();
		c.sub();
	}

}
