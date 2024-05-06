package inheritance;
class Demo{
	void add() {
		System.out.println("ok");
	}
}
public class MethodOverriding extends Demo{
	void add() {
		super.add();
		System.out.println("ok..1");
		//super.add();

	}
	public static void main(String[] args) {
		MethodOverriding m=new MethodOverriding();
		m.add();
		m.add();
	}

}
