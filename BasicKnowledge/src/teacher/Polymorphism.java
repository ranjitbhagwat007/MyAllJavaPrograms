package teacher;

class Demo{
	void add() {
		System.out.println("ok");
	}
}
public class Polymorphism extends Demo{
	void add() {
		//super.add();
		System.out.println("ok..1");
		//super.add();

	}
	public static void main(String[] args) {
		Demo m=new Demo();
		m.add();
		m.add();
	}
}
